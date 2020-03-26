package com.amanymous;

public class PersonLinkedList {
    private static Node head;
    public PersonLinkedList(Person person){
        head =new Node();
        head.person=person;
        head.link=null;
    }
    //child class
    public boolean insertitem(Person person){
        Node n=new Node();
//        n.value=item;
//        n.link=head;
//        head=n;
//        return true;

        Node new_node;
        new_node=head;
        while (new_node.link!=null){
            new_node=new_node.link;
        }
        n.person=person;
        n.link=null;
        new_node.link=n;
        return true;
    }
    public static void printlist(){
       Node z=head.link;
        while (z!=null){
            System.out.println(z.person.toString());
            z=z.link;
        }
    }
    public static boolean deleteItem(String name) {
        Node y;
        if (name.equals(head.person.getName())) {   //  if(head.value==item){
            head = head.link.link;  //head=head.link;
            return true;
        } else {
            Node x = head;
            y = head.link;
            while ((y != null) && !(y.person.getName().equals(name))) {
                x = y;
                y = y;
            }
        }
        if (y != null) {
            y.link = y.link;
            return true;
        } else {
            return false;
        }
    }
    }
//    public void sortlist(){
//        int c=0;
//       Node a=head.link;
//        while (a.link!=null){
//            Node b=head.link;
//            while (b.link !=null){
//                if(b.person < b.link.person){
//                    c=b.person;
//                    b.person=b.link.person;
//                    b.link.person=c;
//                }
//                b=b.link;
//            }
//            a=a.link;
//        }
    
    class Node{
        Person person;
        Node link;

    }


