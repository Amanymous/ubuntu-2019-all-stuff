package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ford f=new ford(90,"black",2000,2100,150,2019);
        truck t=new truck(100,"yellow",3000,3300);
        car c=new car(110,"silver",4000,4100);
        f.showford();
        t.showntruck();
        c.showncar();
    }
}
