import java.util.Random;
import java.util.*;
/*Write a program that meet the following requirements.
* Create an array with 100 randomly chosen integers.
* Prompts the user to enter the index of the array,then displays the corresponding element value.
* If the specified index is out of bond displays the message out of bounds.*/
public class array {
    public static void main(String[] args) {
        try{int c;
            System.out.println("enter the index:");
            Scanner ob=new Scanner(System.in);
            int a=ob.nextInt();

        Random t = new Random();
            int[] arr = new int[100];
        // random integers in [0, 100]

        for (c = 1; c <= arr.length; c++) {
            System.out.println(t.nextInt(100));
        }} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bound:");
        }
    }
    }
