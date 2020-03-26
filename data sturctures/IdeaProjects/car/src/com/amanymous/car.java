package com.amanymous;

public class car {
    int speed;String color;double regularPrize;double getScalePrice;
    car(int speed,String color,double regularPrize,double getScalePrice){
        this.speed=speed;
        this.color=color;
        this.getScalePrice=getScalePrice;
        this.regularPrize=regularPrize;
    }
    void showncar(){
        System.out.println("the car prize is:"+getScalePrice);
    }
}
 class truck extends car{
int weight;double discount;
    truck(int speed, String color, double regularPrize, double getScalePrice) {
        super(speed, color, regularPrize, getScalePrice);
        if(weight>2000){
            discount=getScalePrice%10;
        }
        else{
            discount=getScalePrice%20;
        }
    }
    void showntruck(){
        System.out.println("truck price:"+getScalePrice);
    }
}
 class ford extends car{
    int year;int manufactureDiscount;
    ford(int speed, String color, double regularPrize, double getScalePrice,int manufactureDiscount,int year) {
        super(speed, color, regularPrize, getScalePrice);
        this.getScalePrice=getScalePrice-manufactureDiscount;
    }
    void showford(){
        System.out.println("class ford and scale price:"+getScalePrice);
    }
}

