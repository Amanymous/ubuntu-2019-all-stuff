package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here\
book b = new book("My Notes", 650);
System.out.println("Title:"+b.getTitle()+","+"Pages:" +b.getPages());
Textbook tb = new Textbook("CPP ", 650, "XYZ", "software engineering");
System.out.println("Title:"+tb.getTitle()+","+"Pages:"+tb.getPages()+
"Grade Level:"+tb.getGradeLevel()+","+"Course:"+tb.getCourseName()); }
}
