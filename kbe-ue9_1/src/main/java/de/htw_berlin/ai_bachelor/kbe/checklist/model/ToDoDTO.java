package de.htw_berlin.ai_bachelor.kbe.checklist.model;
import de.htw_berlin.ai_bachelor.kbe.checklist.services.ToDoService;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class ToDoDTO {


    private ToDoService toDoService;

    private ToDo toDo;

    public ToDoDTO() {
        toDoService = new ToDoService();
    }

    public ToDo getToDo() {
        return toDo;
    }

    public void setToDo(ToDo toDo) {
        this.toDo = toDo;
    }


    public boolean saveToDo(){
        if (toDoService.save(toDo)){
            return true;
        }
        return false;
    }
}
