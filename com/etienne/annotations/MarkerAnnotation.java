package com.etienne.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MarkerAnnotation : fournit des instructions de haut niveauau compilateur
 * et la façon dont vous écrivez votre annotation personnalisée
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MarkerAnnotation {
}
