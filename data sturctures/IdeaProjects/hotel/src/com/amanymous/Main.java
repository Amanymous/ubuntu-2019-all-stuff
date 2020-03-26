package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hotelroom myRoom = new hotelroom(201);
        myRoom.getRoom();
        hotelroom others = new hotelroom(300);
        others.getRoom();
        suite s=new suite(350);
        s.getRoom();
    }
}
