package com.lohika.training.model;

/**
 * Base interface for all Shapes
 */
public interface Shape {
    /**
     * Draw shape
     */
    default void draw(){
        System.out.println("Default implementation of Shape");
    }

}
