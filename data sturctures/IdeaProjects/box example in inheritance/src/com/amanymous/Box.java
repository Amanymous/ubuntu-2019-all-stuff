package com.amanymous;

public class Box {
    double width,depth,height;
    Box(Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(double w,double d,double h){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        width=depth=height=len;
    }
    double volume(){
        return width*depth*height;
    }
}
class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}
class ColorBox extends Box{
    int color;
    ColorBox(double w, double h, double d, int c){
        width=w;
        height=h;
        depth=h;
        color=c;
    }
}