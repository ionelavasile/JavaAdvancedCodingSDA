package com.sda.ionelavasile.advanced.coding.oop.ex2;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Point2D point1 = new Point2D(10, 15);
        Point2D point2 = new Point2D(5, 10);

        Circle circle = new Circle(point1, point2);

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.move(new MoveDirection(2, 3));

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        System.out.println("--------------------");
        point1.move(new MoveDirection(3, 5));
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.resize(5);
        System.out.println("--------------------");
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        Point2D x = new Point2D(3, 3);
        Point2D y = new Point2D(3, 6);
        Point2D k = new Point2D(9, 3);
        Point2D z = new Point2D(9, 6);


    }
}

