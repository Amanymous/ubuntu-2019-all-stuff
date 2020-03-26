/*Create an interface shape with three child classes Circle,Square
and Rectangle.Create a method draw in each class.Create an object
* of each class .The text of draw method e.g.Circle is "this is a
circle." */
package com.amanymous;
public class Interface {
    static class Circle{
        void DrawCricle(){
            System.out.println("this is circle:");
        }
    }
    static class Square{
        void DrawSquare(){
            System.out.println("this is square:");
        }
    }
   static class Rectangle{
        void DrawRectangle(){
            System.out.println("this is rectangle:");
        }
    }

}
