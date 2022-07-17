import java.util.Random;
import java.util.Scanner;

public class Main {

//  Declarations
    Random rnd = new Random();
    private int miss=0;
    private final int num = rnd.nextInt(99);

    public static void main(String[] args) {

//      Declarations
        Main obj = new Main();
        Scanner userInput = new Scanner(System.in);

        int guess;

//      Start of the game
        System.out.println(obj.getNum());
        System.out.println("Hello!\nGuess the number:");
        do{
            guess = userInput.nextInt();
            obj.compere(guess);

        }while(guess != obj.getNum());
    }
    // Methods for "cleaner" code (more like for fun)

    void incrementMiss(){
        this.miss++;
    }

    int getMiss(){
        return miss;
    }

    int getNum(){
        return num;
    }

    void toHigh(){
        System.out.println("Ops to high!\nGuess again:");
    }

    void toLow(){
        System.out.println("Ops to low!\nGuess again:");
    }

    void match(){
        System.out.println("You guessed!\nThe number is: " + getNum()
                + "\nYou missed: " + getMiss() + " times."
                + "\nYou win!");
    }

    void compere(int guess){
        if(guess > getNum()){
            toHigh();
            incrementMiss();
        }

        else if(guess < getNum()){
            toLow();
            incrementMiss();
        }

        else{
            match();
        }
    }
}

