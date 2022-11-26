package com.sda.ionelavasile.advanced.coding.oop.ex2;

public class Main {

    public static void main(String[] args) {

        Point2D point1 = new Point2D(10,15);
        Point2D point2 = new Point2D(5,10);

        Circle circle = new Circle(point1,point2);

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.move(new MoveDirection(2,3));

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        System.out.println("--------------------");
        point1.move(new MoveDirection(3,5));
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());



    }
}

