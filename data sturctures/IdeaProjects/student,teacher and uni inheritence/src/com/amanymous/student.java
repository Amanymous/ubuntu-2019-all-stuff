/*
Q1.Develop a registration system for a University.  It should consist of three classes namely
Student, Teacher, and Course.  For example, a student needs to have a name, roll number, address 
and GPA to be eligible for registration. Therefore choose appropriate data types for encapsulating
these properties in a Student objects.  Similarly a teacher needs to have name,
address, telephone number, and a degree (or a list of degrees) he/she has received.
Finally courses must have a name, students (5 students) registered for the course, and a teacher
assigned to conduct the course. Create an object of Course with 5 Students and a Teacher.
A call to a method, say printDetails(), of the selected course reference should print name of the
course, details of the teacher assigned to that course, and names and roll numbers of the students
 enrolled with the course. */
package com.amanymous;
import java.util.*;
public class student {
        double student_name;
        double roll_number;
        double GPA;
        student(student ob){
            student_name=ob.student_name;
            roll_number=ob.roll_number;
            GPA=ob.GPA;
        }
        student(double s, double r, double g){
            student_name=s;
            roll_number=r;
            GPA=g;
        }
        void stu() {
            String[] s = new String[5];
            for (int i = 0; i <= s.length; i++) {
                System.out.println("enter student names,roll number and GPA=");
                Scanner in = new Scanner(System.in);
                s[i] = in.nextLine();
            }

        }
static class teacher{
    double teacher_name;
    double teacher_number;
    double teacher_address;
    double teacher_degree;
    teacher(teacher ob){
        teacher_name=ob.teacher_name;
        teacher_number=ob.teacher_number;
        teacher_address=ob.teacher_address;
        teacher_degree=ob.teacher_degree;
    }
    teacher(double n, double fn, double d,double dg){
       teacher_name=n;
       teacher_number=fn;
       teacher_address=d;
       teacher_degree=dg;
    }
    void te() {
        String[] n = new String[5];
        for (int i = 0; i <= n.length; i++) {
            System.out.println("enter name,address,phone number and degree=");
            Scanner in = new Scanner(System.in);
            n[i] = in.nextLine();
        }

        }}
static class course{
            double sub;
            course(course ob){
                sub=ob.sub;
            }
            course(double s){
                sub=s;
            }

    void cou() {
        String[] c = new String[5];
        for (int i = 0; i <= c.length; i++) {
            System.out.println("enter courses");
            Scanner in = new Scanner(System.in);
            c[i] = in.nextLine();
        }

}}}
