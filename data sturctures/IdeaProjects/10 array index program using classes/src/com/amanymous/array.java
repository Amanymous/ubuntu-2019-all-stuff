/*write a program to take 10 integer values from user and display the odd values with their
 indexs and copy of the original array by using the search and copy method respectively,define in array class
 */
package com.amanymous;
import java.lang.reflect.Array;
import java.util.*;
public class array {

        public static int  findIndex (int[] my_array, int j) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i]%2 == 1) return i;
            else i=i+1;
        }
        return -1;


    }}
/*
*  Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter 10 numbers:");
        for(int i=0; i<=n; i++){
            arr[i]=s.nextInt();
           // System.out.println("numbers are:"+arr);
            if(arr[i]%2==1){
                int x = (int) Array.get(arr, i);
                System.out.println("index value of add are"+x);
                //System.out.println("odd value indexes are:"+arr[i]);
                * ////////////////
                {
        int arr[]={11,22,33,44,55,66,77,88,99,111};
        for(int i=0; i<=arr.length; i++){
            if(arr[i]%2==1){
                System.out.println("odd indexes are:"+arr[i]);
            }
        }*/
