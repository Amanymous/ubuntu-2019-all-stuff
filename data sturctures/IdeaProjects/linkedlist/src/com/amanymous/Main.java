package com.amanymous;

public class Main {
    public static void main(String[] args) {
	// write your code here
//       1) llist l=new llist(1);
//            llist l=new llist();//3)
//        l.insertitem(2);    //3)
//            l.insertitem(9);
//            l.insertitem(5);
//        llist.printlist();
//            l.sortlist();//4)
//        System.out.println();//4)
//            llist.printlist();//4)
//         1)   output:10
//        9
//        1

//        llist.deleteItem(5);//2)
//        llist.printlist();
//     2)   output://yahan 5 ko delete kardiya ha
//        5
//        9
//        1
//        9
//        1


//        person linkedlist
          Person person1=new Person("aman","272");
          Person person2=new Person("mubashir","266");
          PersonLinkedList list=new PersonLinkedList(person1);
          list.insertitem(person1);
          list.insertitem(person2);
          list.printlist();

    }
}
