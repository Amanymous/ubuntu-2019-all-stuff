package com.amanymous;


public class calu {
    Scanner input = new Scanner(System.in);


		System.out.println("Welcome to Calc 1.0!");
		System.out.println("This is the main menu");
		System.out.println("Choose your expression: ");
		System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide ");

    int choice = input.nextInt();

		switch (choice){
        case 1:
            addition();
        case 2:
            substraction();
        case 3:
            multiplication();
        case 4:
            divide();
    }
}

    static void addition(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a + b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void substraction() {
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a - b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void multiplication(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a * b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void divide(){

        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a / b;
        System.out.println ("The total value is " + c);
        return;
    }
}
    }
    }