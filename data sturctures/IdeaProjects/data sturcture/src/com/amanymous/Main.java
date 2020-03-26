package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        my m=new my();
//        if(m.isFull()){
//            m.push(2);
//            m.push(4);
//            m.push(6);
//            m.push(9);
//        }
//        System.out.println(m.pop());
//        System.out.println(m.pop());
//        output:9,6 hoga ku ky stack hamesha oper value nikalta ha

//        personSTACK FROM HERE
          Person person=new Person("aman","272");
          Person person1=new Person("mubashir","266");

          PersonStack stack=new PersonStack();
          stack.push(person);
          stack.push(person1);
        System.out.println(stack.pop().toString());

//        output:mubashir,266 last item ko nikaly ga
    }
}
