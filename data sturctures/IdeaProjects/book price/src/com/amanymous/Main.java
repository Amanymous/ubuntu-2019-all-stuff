package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here

        fiction f=new fiction("harry potter",100);
        nonfiction nf=new nonfiction("linux",200);
        System.out.println("fiction:"+f.getTitle()+ "costs $"+f.getPrice());
        System.out.println("fiction:"+nf.getTitle()+ "costs $"+nf.getPrice());
        nf.showInfo();
        f.showInfo();
    }
    }

