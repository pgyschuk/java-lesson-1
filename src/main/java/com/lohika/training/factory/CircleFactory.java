package com.lohika.training.factory;

import com.lohika.training.model.Circle;
import com.lohika.training.model.Shape;

/**
 * Factory produce Circles
 */
public class CircleFactory implements ShapeFactory {
    public Shape create() {
        return new Circle();
    }
}
