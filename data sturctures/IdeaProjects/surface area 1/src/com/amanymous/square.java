package com.amanymous;

/*create a class named square that contain data fields for height,width
and surface area and method named compute surface area().create a child
class named cube contain an additional data field named depth and a
computersurfacearea() method that overrides the parent method .write an application
that initiates a square object and cube object and display the surface area of the
object.save file as cube.java,square.java and demosquare.java
*/
public class square {
    double height,width;
    square(double height,double width){
        this.width=width;
        this.height=height;
    }
    void surfaceArea(){
        System.out.println("the square is :"+height*width);
    }}

class cube extends square{
    double depth;

    cube(double height, double width,double depth) {
        super(height, width);
        this.depth=depth;
    }
    void computesurfacearea(){

        System.out.println("the cube is:"+depth*height*depth);
    }

}