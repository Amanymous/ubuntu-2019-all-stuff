package com.amanymous;

public class A {
    int i;
   private int j;
    //ager ma j ko privater kardu to ye nai chaly ga
    void setij(int a,int b){
        i=a;
        j=b;
    }
}
class B extends A{
    int total;
    int j;
    void sum(){
        total=i+j;
    }
}
