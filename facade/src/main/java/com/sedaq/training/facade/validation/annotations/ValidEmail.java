package com.sedaq.training.facade.validation.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sedaq.training.facade.validation.EmailValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Pavel Šeda
 *
 */
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {
	String message() default "Invalid email";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
