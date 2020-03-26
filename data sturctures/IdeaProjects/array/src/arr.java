import java.util.Scanner;

public class arr {
    /*public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 78, 18, 29, 99};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
        System.out.println("Index position of 15 is: " + findIndex(my_array, 15));
        System.out.println("Index position of 29 is: " + findIndex(my_array, 29));
        System.out.println("Index position of 99 is: " + findIndex(my_array, 99));*/

    public class zodiac {
        void zodiac(){
            int birth_date;
            String month;
            String sign="";
            Scanner obj=new Scanner(System.in);
            System.out.println("enter your birth date:");
            birth_date=obj.nextInt();
            System.out.println("enter your month:");
            month=obj.nextLine();
            if (month == "January") {
                if (birth_date < 20)
                    sign = "Capricorn";
                else
                    sign = "Aquarius";
            } else if (month == "February") {
                if (birth_date < 19)
                    sign = "Aquarius";
                else
                    sign = "Pisces";
            } else if(month == "March") {
                if (birth_date < 21)
                    sign = "Pisces";
                else
                    sign = "Aries";
            } else if (month == "April") {
                if (birth_date < 20)
                    sign = "Aries";
                else
                    sign = "Taurus";
            } else if (month == "May") {
                if (birth_date < 21)
                    sign = "Taurus";
                else
                    sign = "Gemini";
            } else if( month == "June") {
                if (birth_date < 21)
                    sign = "Gemini";
                else
                    sign = "Cancer";
            } else if (month == "July") {
                if (birth_date < 23)
                    sign = "Cancer";
                else
                    sign = "Leo";
            } else if( month == "August") {
                if (birth_date < 23)
                    sign = "Leo";
                else
                    sign = "Virgo";
            } else if (month == "September") {
                if (birth_date < 23)
                    sign = "Virgo";
                else
                    sign = "Libra";
            } else if (month == "October") {
                if (birth_date < 23)
                    sign = "Libra";
                else
                    sign = "Scorpio";
            } else if (month == "November") {
                if (birth_date < 22)
                    sign = "scorpio";
                else
                    sign = "Sagittarius";
            } else if (month == "December") {
                if (birth_date < 22)
                    sign = "Sagittarius";
                else
                    sign ="Capricorn";
            }
            System.out.println("The astrological sign for " + birth_date + " " + month + " is " + sign );
        }
    }

}


