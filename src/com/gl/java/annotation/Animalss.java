package com.gl.java.annotation;

import java.lang.annotation.*;

/**
 * @author PC
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Animalss {
    Animals[] value();
}
