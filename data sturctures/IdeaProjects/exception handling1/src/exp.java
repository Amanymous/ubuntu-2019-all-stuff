import java.io.IOException;
public class exp {
    
    public static void main(String[] args) {


        try {
            int a = 1;
            int b = 10 / a;
            try {
                if (a == 1)
                    a = a / a - a;
                if (a == 2) {
                    int c[] = {1};
                    c[8] = 9;
                }} catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
                System.out.println("B");
            } finally {
                System.out.print("A");
            }

    }}
       /* try
        {
            int i, sum;
            sum = 10;
            for (i = -1; i < 4 ;++i)
            {
                sum = (sum / i);
                System.out.print(i);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.print("0");
        }
    }}*/






      /*  int i = 12;
        for(int j=-3 ;j>1 ; j++)
            try {
                System.out.println("“Try block entered “" + "“i = “"+ i + "“ j = “"+j);
                System.out.println(i/j);
// Divide by 0 - exception thrown
                System.out.println("“Ending try block”");
            } catch(ArithmeticException e) {
// Catch the exception
                System.out.println("“Arithmetic exception caught”");}

        System.out.println("After try block");
        return;
    }}*/




       /* int i = 1;
        int j = 0;
        try {
            System.out.println("Try block entered " + "i = "+ i + " j = "+j);
            System.out.println(i/j);
// Divide by 0 - exception thrown
            System.out.println("Ending try block");
        } catch(ArithmeticException e) {
// Catch the exception
            System.out.println("Arithmetic exception caught"+e);
        }
        System.out.println("After try block");
        return;
    }}
*/




/*  int[] a=new int[100];
        for(int i=0; i<=50; i++){
            a[i]=(int) Math.ceil(Math.random()*100);
        }
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("enter the array index.");
            int index=s.nextInt();
            System.out.println("index  number is:"+a[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ans"+e);
        }
    }
}*/