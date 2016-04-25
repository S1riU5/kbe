package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import de.htw_berlin.ai_bachelor.kbe.checklist.validator.MyInterval;
import sun.util.resources.LocaleData;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ToDo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private boolean done = false;

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

}
