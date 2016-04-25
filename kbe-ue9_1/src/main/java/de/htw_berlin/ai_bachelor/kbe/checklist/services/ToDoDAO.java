package de.htw_berlin.ai_bachelor.kbe.checklist.services;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

/**
 * Created on 17/01/16.
 */
public class ToDoDAO extends GenericDAO<ToDo> implements Serializable {

    @Override
    protected Class<ToDo> getClazz(){
        return ToDo.class;
    }

    public ToDoDAO() {
        super();
    }

    public void save (ToDo toDo){

        try {
            beginTransaction();
            System.out.println(toDo);
            super.save(toDo);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("Failed to save");
            throw e;
        }
    }

    public ToDo update(ToDo toDo){
        try {
            beginTransaction();
            super.update(toDo);
            commit();
        }catch (Exception e){
            rollback();
            throw  e;
        }
        return toDo;

    }

    public List<ToDo> getAllTodos(){
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<ToDo> criteriaQuery = criteriaBuilder.createQuery(getClazz());
        criteriaQuery.from(getClazz());
        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }
}
