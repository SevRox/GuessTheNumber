import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Declarations
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();
        int guess, miss=0, num = rnd.nextInt(99);

//      Start of the game
        System.out.println(num);
        System.out.println("Hello!\nGuess the number:");
        do{
            guess = userInput.nextInt();

            if(guess > num){
                System.out.println("Ops to high!\nGuess again:");
                miss++;
            }

            else if(guess < num){
                System.out.println("Ops to low!\nGuess again:");
                miss++;
            }
            else {
                System.out.println("You guessed!\nThe number is: " + num
                        + "\nYou missed: " + miss + " times."
                        + "\nYou win!");
            }
        }while(guess != num);
    }
}
