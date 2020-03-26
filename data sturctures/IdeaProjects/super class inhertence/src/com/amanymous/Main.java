package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BoxWeight my1=new BoxWeight(1,2,3,4);
        BoxWeight my2=new BoxWeight(5,6,7,8);
        BoxWeight my3=new BoxWeight();
        BoxWeight my4=new BoxWeight(5,6);
        BoxWeight my5=new BoxWeight(my1);
        double vol;
        vol=my1.volume();
        System.out.println("volume of my1="+vol+"\nweight1="+my1.weight);
        vol=my2.volume();
        System.out.println("volume of my2="+vol+"\nweight2="+my2.weight);
        vol=my3.volume();
        System.out.println("volume of my3="+vol+"\nweight3="+my3.weight);
        vol=my4.volume();
        System.out.println("len cube of my4="+vol+"\nweight4="+my4.weight);
        vol=my5.volume();
        System.out.println("volume of my5="+vol+"\nweight5="+my5.weight);

    }
}
