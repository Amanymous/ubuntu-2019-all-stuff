public class fact {
   int facto(int a){
       int result;
       if(a==1){
           return 1;}
              result=facto(a-1)*a;
              return result;
           }
 System.out.println("the factorial 4 is="+f.fact(4));
   }

