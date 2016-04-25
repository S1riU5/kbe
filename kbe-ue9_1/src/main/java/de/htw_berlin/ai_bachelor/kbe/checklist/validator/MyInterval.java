package de.htw_berlin.ai_bachelor.kbe.checklist.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created on 12/01/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = IntervalValidator.class)
@Documented
public @interface MyInterval {
    public abstract String message() default "Interval is invalid";
    public abstract Class<?> [] groups() default {};
    public abstract Class<? extends Payload>[] payload() default {};

}
