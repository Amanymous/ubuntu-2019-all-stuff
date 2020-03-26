package com.amanymous;

abstract class Auto {

    abstract void setprice();

}
class ford extends Auto {
    double price;
    void setPrice(double price){
        price=200000;
    }

    public double getford() {
        return price;
    }
}
class chevy extends Auto{
    double price;
    void setchevy(double price){
        price=220000;
    }

    public double getchevy() {
        return price;
    }
}
