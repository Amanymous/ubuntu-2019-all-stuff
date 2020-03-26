package com.amanymous;

public class car {
    int speed;double regularPrice;String color;double getScalePrice;
    car(int speed,double regularPrice,String color,double getScalePrice){
        this.speed=speed;
        this.getScalePrice=getScalePrice;
        this.color=color;
        this.regularPrice=regularPrice;
    }
   void car(){
       System.out.println("car price:"+regularPrice);
   }
}
 class truck extends car{
    int weight,discount;
    truck(int speed, double regularPrice, String color, double getScalePrice,
          int weight,int discount) {
        super(speed, regularPrice, color, getScalePrice);
        this.weight=weight;
        this.discount=discount;
        //if(weight>2000)discount= (int) (10%getScalePrice);
    }
    void truck(){
        if(weight>2000)discount= (int) (10%getScalePrice);
        else discount= (int) (20%getScalePrice);
        System.out.println("your scale price is:"+discount);
    }
}
class ford extends car{
    int year,manufacturedDiscount;
    ford(int speed, double regularPrice, String color, double getScalePrice,
         int year,int manufacturedDiscount){
        super(speed, regularPrice, color, getScalePrice);
        this.manufacturedDiscount=manufacturedDiscount;
        this.year=year;
    }
    void ford(){
        getScalePrice=getScalePrice-manufacturedDiscount;
        System.out.println("your scale price is:"+getScalePrice+"year:"+year);
    }
}