import java.util.*;
public class exp {
    public static void main(String[] args) {
        double i,j;
        try {

            for (i = 50; i <= 60; i++) {
                System.out.println(i);
                System.out.println("a");
            }}
         catch(ArrayIndexOutOfBoundsException b){

                System.out.println("marks repersent A grade:" + b);
            }
        try {

            for (i = 70; i <= 80; i++) {
                System.out.println(i);
                System.out.println("b");
            }}
        catch(ArrayIndexOutOfBoundsException b){

            System.out.println("marks repersent A grade:" + b);
        }

        try {

        for (i = 90; i <= 100; i++) {
            System.out.println(i);
            System.out.println("c");
        }}
         catch(ArrayIndexOutOfBoundsException b){

        System.out.println("marks represent A grade:" + b);
    }

}}
