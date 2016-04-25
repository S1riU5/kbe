package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import de.htw_berlin.ai_bachelor.kbe.checklist.validator.MyInterval;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
public class ToDo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    private boolean done;

    @Future(message = "Das Fälligkeitsdatum muss in der Zukunft liegen")
    @NotNull
    private Date date;

    @MyInterval()
    private Integer priority = 1;


    private ToDo(String name, boolean done) {
        super();
        this.name = name;
        this.done = done;
        date = Date.from(new Date().toInstant().plus(1, ChronoUnit.DAYS));

    }

    public ToDo(String name) {
        this(name, false);
    }

    protected ToDo() {
        this.done = false;
        date = Date.from(new Date().toInstant().plus(1,ChronoUnit.DAYS));
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        if (done != toDo.isDone()) return false;
        if (name != null ? !name.equals(toDo.getName()) : toDo.getName() != null) return false;
        if (date != null ? !date.equals(toDo.getDate()) : toDo.getDate() != null) return false;
        return priority != null ? priority.equals(toDo.getPriority()) : toDo.getPriority() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (done ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
}
