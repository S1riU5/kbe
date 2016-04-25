package de.htw_berlin.ai_bachelor.kbe.checklist.validator;

import de.htw_berlin.ai_bachelor.kbe.checklist.validator.IntervalValidator;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.Interval;

import javax.el.ValueExpression;
import javax.faces.el.*;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created on 12/01/16.
 */
public class IntervalValidator implements ConstraintValidator<MyInterval, Integer> {

    private int upperBoarder;

    @Override
    public void initialize(MyInterval myInterval) {
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        FacesContext facesContext = FacesContext.getCurrentInstance();
        Application application = facesContext.getApplication();

        Interval interval= (Interval) application.getExpressionFactory()
                .createValueExpression(facesContext.getELContext(),"#{interval}",Interval.class)
                .getValue(facesContext.getELContext());


        if (interval == null) {
            return false;
        }

        return interval.getMaxInterval() >= integer;

    }


}
