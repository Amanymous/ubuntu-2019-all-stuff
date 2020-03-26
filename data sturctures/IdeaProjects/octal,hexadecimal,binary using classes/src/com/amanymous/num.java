/*write a program to takes the integer value from the user and convert into
*binary hexadecimal and octal with the help of methods define in wrapper class
* of integer and long*/

package com.amanymous;
import java.util.*;
public class num {
    int num;
    void getnum(){
        System.out.println("convert integer to hexadecimal,octal and binary:");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        num=obj.nextInt();
    }
    void convert(){
        String hexadecimal=Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : " + hexadecimal);
        String octal=Integer.toOctalString(num);
        System.out.println("Octal Value is : " + octal);
        String binary=Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
    }
}
