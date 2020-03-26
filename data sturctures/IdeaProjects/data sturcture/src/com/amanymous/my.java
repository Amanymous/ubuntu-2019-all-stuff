package com.amanymous;

public class my {
    private int [] stack;
    private int top;
    private int size;
    public my(){
        top=-1;
        size=100;
        stack=new int[50];

    }
    public my(int size){
        top=-1;
        this.size=size;
        stack=new int[this.size];
    }
    public boolean push(int item){
        if(isFull()) {
            top++;//yahn value push karrahy hain
            stack[top] = item;
            return true;
        }
        else{
            return false;
        }
    }
    public int pop(){
        return stack[top--];
    }
    //f our stack is empty
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==stack.length -1);
    }

}
