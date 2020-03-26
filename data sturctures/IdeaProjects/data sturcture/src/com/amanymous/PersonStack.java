package com.amanymous;

public class PersonStack {
    private Person [] stack;
    private int top;
    private int size;
    public PersonStack(){
        top=-1;
        size=100;
        stack=new Person[50];

    }
    public PersonStack(int size){
        top=-1;
        this.size=size;
        stack=new Person[this.size];
    }
    public boolean push(Person item){
        if(isFull()) {
            top++;//yahn value push karrahy hain
            stack[top] = item;
            return true;
        }
        else{
            return false;
        }
    }
    public Person pop(){
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
