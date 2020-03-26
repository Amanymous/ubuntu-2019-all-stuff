package com.amanymous;
abstract class Book{
     String title;double price;
     Book(String title,double price){
         this.price=price;
         this.title=title;
     }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
 class fiction extends Book {
    fiction(String title,double price) {
        super(title, price);
        setPrice();
    }
     public void setPrice()
     {
         price = 24.99;
     }

     void showInfo()
     {
         System.out.println("Fiction-Title:"+getTitle()+"$"+getPrice());
     }
 }
class nonfiction extends Book{
    nonfiction(String title,double price) {
        super(title, price);
        setPrice();
    }
    public void setPrice()
    {
        price = 37.99;
    }

    void showInfo()
    {
        System.out.println("nonFiction-Title:"+getTitle()+"$"+getPrice());
    }
}