package com.amanymous;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int a[]=new int[10];
        for(int i=0; i<10; i++){
            a[i]=sc.nextInt();
        }
        int g=11;
        int f=33;
        int l=55;
        int k=77;
        int y=99;
        System.out.println("the odd value of array and their indexes:");
        System.out.println(a[0]+"found at index:"+ Arrays.binarySearch(a,f));
        System.out.println(a[2]+"found at index:"+ Arrays.binarySearch(a,g));
        System.out.println(a[4]+"found at index:"+ Arrays.binarySearch(a,l));
        System.out.println(a[6]+"found at index:"+ Arrays.binarySearch(a,k));
        System.out.println(a[8]+"found at index:"+ Arrays.binarySearch(a,y));
        System.out.println("the copy of array:");
        int b[]=Arrays.copyOf(a,10);
        for(int p=0; p<b.length; p++){
            System.out.println(b[p]);
        }
    }
}
