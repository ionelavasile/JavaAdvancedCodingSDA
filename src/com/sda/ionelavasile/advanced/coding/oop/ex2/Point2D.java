package com.sda.ionelavasile.advanced.coding.oop.ex2;

/**
 * Create a Point2D class with fields double x, double y, getters, setters and constructor. Then create a Circle class that will have a constructor:
 * Circle(Point2D center, Point2D point)
 *  The first parameter specifies the center of the circle, the second is any point on the circle. Based on these points, the Circle class is to determine:
 * • circle radius when calling double getRadius() method
 * • circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 *
 * Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task (Point2D and Circle).
 *
 * When the move(MoveDirection moveDirection) method is called, the objects are to change their position based on the provided direction (MoveDirection).
 * Validate the offset by calling the other Circle methods.
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */
public class Point2D implements Movable{

    private double x;
    private double y;


    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = this.x + moveDirection.getX();
        this.y = this.y + moveDirection.getY();
    }

    public double getDistanceFrom(Point2D anotherPoint){
        return Math.sqrt(Math.pow(anotherPoint.y - this.y, 2) + Math.pow(anotherPoint.x - this.x, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
