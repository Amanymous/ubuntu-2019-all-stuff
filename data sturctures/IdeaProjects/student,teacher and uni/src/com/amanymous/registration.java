package com.amanymous;

import java.util.Scanner;

public class registration {
 private String s1,s2,s3,s4,s5;
  private String t1,t2,t3,t4,t5;
  private String c1,c2,c3,c4,c5;
     registration(String student1, String student2, String student3, String student4, String student5) {
         s1 = student1;
         s2 = student2;
         s3 = student3;
         s4 = student4;
         s5 = student5;
         t1=teacher1;
         t2=teacher2;
         t3=teacher3;
         t4=teacher4;
         t5=teacher5;
         c1=course1;
         c2=course2;
         c3=course3;
         c4=course4;
         c5=course5;
     }
     char detail;
         void student(String msg){
             System.out.println("student1="+s1+msg);
             System.out.println("student2="+s2+msg);
             System.out.println("student3="+s3+msg);
             System.out.println("student4="+s4+msg);
             System.out.println("student5="+s5+msg);
         }
         void teacher(){
             System.out.println("teacher1="+t1);
             System.out.println("teacher2="+t2);
             System.out.println("teacher3="+t3);
             System.out.println("teacher4="+t4);
             System.out.println("teacher5="+t5);
         }
         void course(){
             System.out.println("course1="+c1);
             System.out.println("course2="+c2);
             System.out.println("course3="+c3);
             System.out.println("course4="+c4);
             System.out.println("course5="+c5);
         }
         }}
Class students extends registration{

    students(String student1,String student2,String student3,String student4,String student5){
        super(student1,student2,student3,student4,student5);}
        void show(String msg){
        System.out.println(msg+detail);
        }



/*
* [15:43, 8/30/2019] Aman Mughal: package com.amanymous;

public class computer {
    private String i,j,k;

    computer(String company,String model,String generation) {
        i = company;
        j = model;
        k = generation;
    }
        void show(){
            System.out.println("computer company:"+ i +" ,model:"+ j +" and generation:"+ k);
        }
    }
    class mycomputer extends computer{
    char detail;
    mycomputer(String company,String model,String generation){
        super(company,model,generation);

    }
    void show(String msg){
        System.out.println(msg+detail);
    }
    }
    class processor{
    private String core,bandwidth,speed,processing;
    processor(processor ob){
        core=ob.core;
        bandwidth=ob.bandwidth;
        speed=ob.speed;
        processing=ob.processing;
    }
    processor(String c,String b,String s,String p){
        core=c;
        bandwidth=b;
        speed=s;
        processing=p;
    }
    void show(){
 System.out.println("processor information core="+ core + " ,bandwidth="+ bandwidth);
        System.out.println("speed="+ speed +" and processing="+ processing);
    }
    }
[15:43, 8/30/2019] Aman Mughal: package com.amanymous;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
        mycomputer my= new mycomputer("HP","probook","7th");
        my.show();
        processor p=new processor("i7","125gb","high","intel");
        p.show();
    }
}*/