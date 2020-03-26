
import java.util.*;
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
