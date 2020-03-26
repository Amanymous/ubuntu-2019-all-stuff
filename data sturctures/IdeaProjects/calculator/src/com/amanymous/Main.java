package com.amanymous;

public class cal {
    double num1=4;
    double  num2=2;
    double result;
    char operator ;
    cal(cal ob){
        num1=ob.num1;
        num2=ob.num2;
        //result=ob.result;
    }
    cal(double n1,double n2){
        num1=n1;
        num2=n2;
        //result=re;
    }
    int volume(){
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            // operator doesn't match any case constant (+, -, *, /)}
            default:
                System.out.printf("Error! operator is not correct");
        }
        return 0;
    }}
