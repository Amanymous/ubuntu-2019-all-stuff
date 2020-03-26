package com.amanymous;

public class Box {
    private double height;
    private double width;
    private double depth;
    Box(Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.height;
    }
    Box(){
        width=-2;
        depth=-2;
        height=-2;
    }
    Box(double w,double h,double d){
        width=w;
        depth=d;
        height=h;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;}
    BoxWeight(double w,double h,double d,int m){
        super(w,h,d);
        weight=m;
    }
    BoxWeight(){
        super();
        weight=-1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight= (int) m;
    }
}
