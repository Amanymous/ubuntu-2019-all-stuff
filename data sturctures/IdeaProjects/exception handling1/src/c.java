public class c {
    static void validage(int age){
        if(age<19){
            throw new ArithmeticException("not valid");
        }else{
            System.out.println("welcome");
        }
    }
}
