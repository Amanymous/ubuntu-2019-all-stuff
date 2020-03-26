/*Create a class Card, and its children classes are Valentine
,Holiday, and Birthday. A card class will have a greeting ()
method that writes out a greeting. Each type of card contains
an appropriate greeting. The Holiday card says "Season's
Greetings." The Birthday card says "Happy Birthday."
The morther card says "Happy Mothers Day". Create objects
of the three child classes: Valentine, Holiday, and Birthday
and show the polymorphic behavior
(call the greeting methods from each object).*/




package com.amanymous;
public class Main {

    public static void main(String[] args) {
	// write your code here
        card ob=new card();
        ob.child1();
        ob.child2();
        ob.child3();
    }
}
