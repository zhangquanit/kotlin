package com.example.kotlin.kotlin.annotation

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author zhangquan
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.CLASS,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
annotation class MyAnnotation