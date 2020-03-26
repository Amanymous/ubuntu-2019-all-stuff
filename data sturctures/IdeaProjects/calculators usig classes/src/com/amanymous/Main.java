    package com.amanymous;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	// write your code here
        cal operationObject=new cal();
        Scanner input = new Scanner(System.in);
        double userInput;
        int userChoice;
        System.out.print("Please Enter The First Number: ");
        userInput = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        userInput = input.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = input.nextInt();
        switch (userChoice){
            case 1:
                operationObject.addition();
                System.out.println();
                break;
            case 2:
                operationObject.subtraction();
                break;
            case 3:
                operationObject.division();
                break;
            case 4:
                operationObject.multiplication();
                break;
    }
}}
