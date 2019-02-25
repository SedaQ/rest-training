package com.sedaq.training.annotations.transactions;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * @author Pavel Seda
 */
@Transactional(rollbackFor = Exception.class)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TransactionalWO {
}
