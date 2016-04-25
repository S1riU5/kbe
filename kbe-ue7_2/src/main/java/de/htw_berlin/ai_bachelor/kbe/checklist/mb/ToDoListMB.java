package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ToDoListMB implements Serializable {

    private static final long serialVersionUID = 1L;


    private ToDoList toDoList;
    private int todosCount = 0;

    public ToDoListMB() {
        super();
        this.toDoList = new ToDoList();
        todosCount = this.getToDoList().getToDos().size();
    }

    public int getCheckedtodos() {
        int checkedToDos = 0;
        for (int i = 0; i < toDoList.getToDos().size(); i++) {
            if (toDoList.getToDos().get(i).isDone()) {
                checkedToDos++;
            }
        }

        return checkedToDos;
    }

    public int getTodosCount() {
        return todosCount;
    }

    //TODO
    public ToDoList getToDoList() {
        return toDoList;
    }

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    public String time() {
        return "time";
    }

    //Should be called if the Button "Speichern" is pushed.
    //Needs configuration in the faces-config.xml.
    public String save() {
        return "save";
    }
}
