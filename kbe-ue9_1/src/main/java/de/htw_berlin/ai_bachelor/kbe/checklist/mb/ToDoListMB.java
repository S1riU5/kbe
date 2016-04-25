package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;


import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;
import de.htw_berlin.ai_bachelor.kbe.checklist.services.ToDoService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class ToDoListMB implements Serializable {

    private static final long serialVersionUID = 1L;


    private ToDoService toDoService;


    private ToDoList toDoList;

    private int toDosCount = 0;

    public ToDoListMB() {
        super();
        toDoService = new ToDoService();
        toDoList = new ToDoList();
        toDosCount = this.getToDoList().getToDos().size();
    }
    @PostConstruct
    public void afterCreation(){

        toDoList.getToDos()
                .forEach(todo -> toDoService.save(todo));
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


    public int getToDosCount() {
        return toDosCount;
    }

    //TODO
    public ToDoList getToDoList() {

        toDoList.getToDos().clear();
        toDoList.getToDos().addAll(toDoService.getAllToDos());
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

    public String interval() {
        return "interval";
    }

    public String createToDo(){
        return "create";
    }


}
