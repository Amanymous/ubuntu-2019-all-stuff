package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BoxWeight my1=new BoxWeight(1,2,3,9);
        BoxWeight my2=new BoxWeight(4,5,6,10);
        ColorBox  my3=new ColorBox(1,2,3,4);
        double vol;
        double vol1;
        vol=my1.volume();
        System.out.println("volume of my1="+vol+"\nand weight1="+my1.weight);
        vol=my2.volume();
        System.out.println("volume of my2="+vol+"\nand weight2="+my2.weight);
        System.out.println("all member of color box"+my3.width+my3.depth+my3.height+my3.color);


    }
}
