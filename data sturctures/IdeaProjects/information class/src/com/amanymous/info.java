package com.amanymous;

public class info {
    private String name;
    private String model;
   private String location;
    double speed;
    double weight;
    public info(){
        name= "Yamaha";
     location ="Karachi";
        System.out.println("Bike name: {0}\nLocation : {1}"+ name+ location);
    }
    public info(double speed){
        name = "xyz";
        model = "Honda Civic 2017";
        this.speed = speed;
        System.out.println("\nName of driver : {0}\nModel : {1}\nSpeed : {2} mph (Est)"+ name+ model+ speed);
    }
    public info(int weight){
        name = "Isuzu";
        model = "CXZ Giga";
        this.weight = weight;
        System.out.println("\nName of lorry : {0}\nModel : {1}\nWeight Carried : {2} Kg"+ name+  model+weight);
    }}


