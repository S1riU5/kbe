package de.htw_berlin.ai_bachelor.kbe.checklist.services;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

import java.io.Serializable;
import java.util.List;


public class ToDoService implements Serializable{

    ToDoDAO toDoDAO;



    public ToDoService() {
        toDoDAO = new ToDoDAO();
    }

    public boolean save(ToDo toDo){
        toDoDAO.save(toDo);
        return true;
    }

    public boolean update(ToDo toDo ){
        toDoDAO.update(toDo);
        return true;
    }

    public List<ToDo> getAllToDos(){
            return toDoDAO.getAllTodos();
    }
}
