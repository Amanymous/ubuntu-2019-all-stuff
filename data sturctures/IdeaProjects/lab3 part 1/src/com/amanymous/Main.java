
package com.amanymous;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello world");
//        List<String> list_s=new ArrayList<String>();
//        list_s.add("aman");
//        list_s.add("mirza");
//        list_s.add("mughal");
//        System.out.println("list before reversing:" +list_s);
//        Collections.reverse(list_s);
//        System.out.println("list after reverssing:"+list_s);

        class LinearArray {
            private int nCap;
            private int Count;
            private String vals[];
            public LinearArray(int cpcty) {
                nCap = cpcty;
                vals = new String[nCap];
                Count = 0;
            }
            public int getCount() {
                return Count;
            }
            public int isEmpty() {
                return Count; //complete this statement
            }
            public boolean isFull() {
                return Count == nCap;
            }
            public String getElement(int p) {
                return // complete this statement
            }
            public void fill_data(String[] v_array,  int n) {
                int k;
                nCap = n * 2;
                vals = new String[nCap];
                for (k = 0; k < n; k++){
                    vals[k] = v_array[k];
                }
                Count = n;

            }
            public int search(String v) {
                int p;
                p = 0;
                while(p < Count) {
                    if (v.equals(// complete this statement
                    return // complete this statement
            else
                    p++;
                }
                return -1;
            }
            public boolean insert(int p, String v) {
                int j;
                if (isFull())
                    return false;
                j = Count-1;
                while(j >= p){
                    vals[j+1] = // complete this statement
                            j--;
                }
                vals[p] = // complete this statement
                //increment Count here
                return true;
            }
            public boolean append(String v) {
                // very simple code
            }
            /*
            public String deleteP(int p) {
                int j;
                String v = vals[p];
                for (j=p+1; j < Count; j++) {
                    vals[j-1] = // complete this statement
                }
                Count--;
                return v;
            }*/
            public void printItems() {
                int k;
                String s ="";
                for (k=0; k < Count; k++) {
                    s += vals[k] + ",";
                }
                System.out.println(s);
            }
        }
        public class F_lab2_linear_array {

            public static void main(String[] args) {
                int k,p;
                String v;
                String values[] = {"Cat", "Pin", "Deer", "Box", "Chair","Boat"};
                LinearArray a = new LinearArray(10);
                a.fill_data(values, 4);
                a.printItems();

                v = "Roof"; p = 1;
                if (a.insert(p, v) == true)
                    System.out.println("Inserted " + v + " at " + p);
                a.printItems();


            }

        }


    }
}
