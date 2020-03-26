package com.amanymous;

import javafx.scene.Node;

public class llist {
    private static Node head;

    public llist(){
        head=new Node();
        //head.value=item;
        head.value=0;
        head.link=null;
    }
//child class
    public boolean insertitem(int item){
        Node n=new Node();
//        n.value=item;
//        n.link=head;
//        head=n;
//        return true;

//        inserting node at the last of list
          Node new_node;
          new_node=head;
          while (new_node.link!=null){
              new_node=new_node.link;
          }
        n.value=item;
          n.link=null;
          new_node.link=n;
          return true;
    }
public static void printlist(){
        Node z=head.link;
        while (z!=null){
            System.out.println(z.value);
            z=z.link;
        }
}
public static boolean deleteItem(int item){
        if(head.link.value==item){   //  if(head.value==item){
            head=head.link.link;  //head=head.link;
            return true;
        }
        else{
            Node x=head;
            Node y=head.link;
            while (true){
                if(y==null || y.value==item){
                    break;
                }
                else {
                    x=y;
                    y=y.link;
                }
            }
            if(y!=null){
                x.link=y.link;
                return true;
            }
            else{
                return false;
            }
        }
}
    public void sortlist(){//4)sorting kar rhy hain idher
        int c=0;
        Node a=head.link;
        while (a.link!=null){
            Node b=head.link;
            while (b.link !=null){
                if(b.value < b.link.value){
                c=b.value;
                b.value=b.link.value;
                b.link.value=c;
                }
                b=b.link;
            }
            a=a.link;
        }
    }
    class Node{
        private int value;
        private Node link;

    }
}
