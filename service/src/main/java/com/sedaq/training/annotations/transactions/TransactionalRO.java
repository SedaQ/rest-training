package com.sedaq.training.annotations.transactions;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * @author Pavel Seda
 */
@Transactional(rollbackFor = Exception.class, readOnly = true)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TransactionalRO {
}

