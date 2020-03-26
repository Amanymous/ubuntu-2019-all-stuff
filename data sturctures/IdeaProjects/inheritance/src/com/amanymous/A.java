package com.amanymous;
   class A {
    int i,j;
   void showij(){
       System.out.println("i and j"+i+j);
    }}
    class B extends A{
       int k;
       void showk(){
           System.out.println("value of k:"+k);
       }
       void sum(){
           System.out.println("i+j+k="+(i+j+k));
       }
    }

