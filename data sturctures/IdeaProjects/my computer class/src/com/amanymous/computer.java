package com.amanymous;

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

