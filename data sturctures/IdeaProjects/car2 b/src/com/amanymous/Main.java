package com.amanymous;
import java.lang.Math;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

          /*  ford f=new ford(90,200000,"yellow",300000
            ,2019,8);
            truck t=new truck(100,100000,"white",150000,
                    9000,10);
            car c=new car(190,800000,"gray",900000);
            t.truck();
            f.ford();
            c.car();*/
      /*    int i ;
        System.out.println("enter integer value:");
          Scanner obj=new Scanner(System.in);
          i=obj.nextInt();
          String Binary=Integer.toBinaryString(i);
          String HexDecimal=Integer.toHexString(i);
          String Octal=Integer.toOctalString(i);
        System.out.println("octal:"+Octal);
        System.out.println("binary:"+Binary);
        System.out.println("hexadecimal:"+HexDecimal);*/

        /*System.out.println("enter month and date:");
        Scanner obj=new Scanner(System.in);
        int month=obj.nextInt();
        int date=obj.nextInt();
        switch(month){
            case 1:
                if(date<=20 && month==1){
                    System.out.println("your sign is aqurius");
                }
            case 2:
                if(date<=21 && month==2){
                    System.out.println("your sign is pieces");
                }
            case 3:
                if(date<=22 && month==3){
                    System.out.println("your sign is aries");
                }
            case 4:
                if(date<=23 && month==4){
                    System.out.println("your sign is taurus");
                }
            case 5:
                if(date<=24 && month==5){
                    System.out.println("your sign is gemini");
                }
            case 6:
                if(date<=25 && month==6){
                    System.out.println("your sign is cancer");
                }
            case 7:
                if(date<=26 && month==7){
                    System.out.println("your sign is leo");
                }case 8:
                if(date<=27 && month==8){
                    System.out.println("your sign is virgo");
                }case 9:
                if(date<=28 && month==9){
                    System.out.println("your sign is libra");
                }case 10:
                if(date<=29 && month==10){
                    System.out.println("your sign is scorpio");
                }
            case 11:
                if(date<=30 && month==11){
                    System.out.println("your sign is saggitarius");
                }
            case 12:
                if(date<=21 && month==12) {
                    System.out.println("your sign is capricon");
                }
            default:
                System.out.println("not exist");

        }
    }
}
-------Zodaic sign-------
*/
      /*  System.out.println("10 integer value from user:");
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0; i<=a.length; i++) {
            a[i] = obj.nextInt();
            int g = 11;
            int f = 33;
            int h = 55;
            int j = 77;
            int l = 99;
            System.out.println("the odd value of array indexes are:");
            System.out.println(a[0] + "found at index=" + Arrays.binarySearch(a, g));
            System.out.println(a[2] + "found at index=" + Arrays.binarySearch(a, f));
            System.out.println(a[4] + "found at index=" + Arrays.binarySearch(a, h));
            System.out.println(a[6] + "found at index=" + Arrays.binarySearch(a, j));
            System.out.println(a[8] + "found at index=" + Arrays.binarySearch(a, l));
        }
        System.out.println("copy of array:");
        int b[]=Arrays.copyOf(a,10);
        for(int p=0; p<=b.length; p++){
            System.out.println(b[p]);
        }

    }}*/
      int[] a=new int[100];
      for(int i=0; i<=a.length; i++){
          a[i]=(int) Math.ceil(Math.random()*100);
      }
      Scanner s=new Scanner(System.in);
      try{
          System.out.println("enter the array index.");
          int index=s.nextInt();
          System.out.println("index  number is:"+a[index]);
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("ans"+e);
      }
    }}