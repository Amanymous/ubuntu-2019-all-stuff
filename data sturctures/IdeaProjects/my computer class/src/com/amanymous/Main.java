package com.amanymous;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
        mycomputer my= new mycomputer("HP","probook","7th");
        my.show();
        processor p=new processor("i7","125gb","high","intel");
        p.show();
    }
}
