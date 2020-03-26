package com.amanymous;

public class card {
    void child1(){
        System.out.println("seasons greeting.");
    }
    void child2(){
        System.out.println("happy birthday.");
    }
    void child3(){
        System.out.println("happy mothers day.");
    }
}
class holiday extends card{
    void child1() {
    }
}
class mother extends card{
    void child2(){
    }
        }
class birth extends card{
    void child3(){
    }
}
