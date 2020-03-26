package com.amanymous;

public class Box {
    int width, height, depth;

    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

}

class Weight extends Box{
    int mass;

    Weight(int w, int h, int d, int m)
    {
        super(w,h,d);
       // width=w;
        //height=h;
        //depth=d;
        mass=m;
    }
    int Mass(){
        return (width*depth*height*mass);
    }
}

