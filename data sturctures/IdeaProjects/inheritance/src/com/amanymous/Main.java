package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A superob=new A();
        B subob=new B();
        superob.i=10;
        superob.j=20;
        System.out.println("content of super:");
        superob.showij();
        System.out.println();
        subob.i=20;
        subob.j=40;
        subob.k=50;
        System.out.println("content of subob:");
        subob.showij();
        subob.showk();
        System.out.println("the sum i,j and k:");
        subob.sum();
    }
}
