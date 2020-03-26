/*Define an abstract base class shape that includes protected data members for the (x,y) position shapes ,a public method to move a shape,
*and a public abstract method show() to output a shape.Derive subclasses for lines,circle and rectangles.Also ,define the class polyline
*as its base class.you can represent a line as two points,a circle as a center and a radius and a rectangle a line as two points, a
*circle as a center and a radius , and a rectangle as two points on diagonally opposite corners.Implement the toString() method for each
* class.Test the classes by selecting ten random objects of the derived classes, and then invoking the show() method for each.Use the
* toString() methods in the derived classes.
*   */


package com.amanymous;
abstract public class shape {
    public abstract double area();
    public abstract double perimeter();

static class Rectangle extends shape {
    protected  double width, length; //sides

    public Rectangle(double length,double width) {
        this.length = length;
        this.width=width;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}
static class Circle extends shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
}}