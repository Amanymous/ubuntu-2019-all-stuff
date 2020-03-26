package com.amanymous;


public class Main {

    public static void main(String[] args) {
	// write your code here
        double width = 5, length = 7;
        shape.Rectangle r= new Rectangle(1,1);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + r.area()
                + "\nResulting perimeter: " + r.perimeter() + "\n");

        // Circle test
        double radius = 5;
        shape.Circle c= new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + c.area()
                + "\nResulting Perimeter: " + c.perimeter() + "\n");
    }
}
