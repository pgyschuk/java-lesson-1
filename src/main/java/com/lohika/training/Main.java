package com.lohika.training;

import com.lohika.training.factory.CircleFactory;
import com.lohika.training.factory.ShapeFactory;
import com.lohika.training.factory.SquareFactory;
import com.lohika.training.model.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.create();
        circle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.create();
        square.draw();
    }
}
