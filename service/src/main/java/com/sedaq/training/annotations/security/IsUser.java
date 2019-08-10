package com.sedaq.training.annotations.security;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.*;

/**
 * The custom annotation <i>@IsUser<i/>. All methods annotated with this annotation expect the user has a role <strong>USER<strong/>.
 *
 * @author Pavel Seda
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasRole('USER')")
@Documented
@Inherited
public @interface IsUser {
}
