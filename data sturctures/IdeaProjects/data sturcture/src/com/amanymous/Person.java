package com.amanymous;

public class Person {
    private String name;
    private String roll_no;
    public Person(String name,String roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    public String toString(){
        return "name:"+this.name+"roll no:"+this.roll_no;
    }

}
