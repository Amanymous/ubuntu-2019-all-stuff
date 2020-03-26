package com.amanymous;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //double a,b;
        double my_roll_number,my_friend_number ;
        RollNumber r=new RollNumber();
        Scanner obj=new Scanner(System.in);
        System.out.println("my roll number:");
        my_roll_number=obj.nextDouble();
        //a=obj.nextDouble();
        System.out.println("my friend roll number:");
        my_friend_number=obj.nextDouble();
        //b=obj.nextDouble();
        r.RollNUMBER();
    }
}
