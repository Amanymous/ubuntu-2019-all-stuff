import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String secretWord = "aman";
        //StringBuffer secretWord=new StringBuffer("aman");
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;
        while (!guess.equals(secretWord) && !outOfGuesses) {
            if (guessCount < guessLimit) {
                System.out.println("enter your guess:");
                guess = keyboardInput.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
            }

        }
        if (outOfGuesses) {
            System.out.println("you lose! only 3 limit");
        } else {

            System.out.println("you win!");
        }
        // write your code here
    }}
