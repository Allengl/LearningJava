package com.gl.java.annotation;

import java.lang.annotation.*;

/**
 * @author PC
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(Animalss.class)
public @interface Animals {
    String name();
}
