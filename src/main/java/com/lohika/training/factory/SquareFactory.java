package com.lohika.training.factory;

import com.lohika.training.model.Shape;
import com.lohika.training.model.Square;

/**
 * Factory produce Squares
 */
public class SquareFactory implements ShapeFactory {
    public Shape create() {
        return new Square();
    }
}
