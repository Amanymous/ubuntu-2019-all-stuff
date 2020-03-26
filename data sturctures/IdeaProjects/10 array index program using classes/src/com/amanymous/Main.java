package com.amanymous;
import java.util.Arrays;

import static com.amanymous.array.findIndex;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] my_array = {25, 14, 56, 15, 36, 56, 78, 18, 29, 99};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 15));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 29));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 99));

    }
}
