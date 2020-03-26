import java.util.ArrayList;
import java.util.Scanner;

public class company{
    public String name;
    public int leg;
}
class arrayL {
    private ArrayList<company> al;

    public arrayL() {
        al = new ArrayList<company>(10);
    }

    public int getcompany(int p) {


         company anm =al.get(p);
        return p;
    }
        public void setNLegs(int p, int leg) {

           company ann= al.get(p);
           ann.leg=leg;
    }
    public void insertAnimal(int p, company anm) {

        al.add(p,anm);
    }
    public void appendAnimal(company anm) {

        al.add(anm);
    }
    public void traverse() {

        for(int i=0; i<al.size(); i++){
            company anm=al.get(i);
            System.out.println(anm.name + " "+ anm.leg);
        }


    }
    public String search(String name) {

        Scanner obj = new Scanner(System.in);
        String kk = obj.next();
        if (name == kk) {
            return kk;
        } else {
            return null;
        }
    }
    public void deleteP(int p) {

         al.remove(p);
    }

}
         class F_ds_lab3_arraylist {
            public static company input_data(Scanner sc) {
                company anm = new company();
                System.out.print("Enter name and nLegs(int) on one line: ");
                anm.name = sc.next();
                anm.leg = sc.nextInt();
                return anm;
            }
            public static void main(String[] args) {
                int p, i, leg;
                String name;
                company anm;
                Scanner sc = new Scanner(System.in);
                ArrayL al=new  ArrayL();
                anm=input_data(sc);
                al.appendAnimal(anm);
                anm=input_data(sc);
                al.insertAnimal(1,anm);
                al.traverse();


            }
        }
























