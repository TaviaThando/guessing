import java.util.Scanner;
import java.util.Random;

public class number_guess {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("We are going to play a number guessing game");

        System.out.println("Guess a number from 1 to 50");

        int num_guess = number.nextInt();     

        Random num = new Random();
        int upperbound = 50;
        //generating random values from 1 to 49
        int num_random = num.nextInt(upperbound);

        if (num_guess == num_random){
            System.out.println("You guessed the correct number!");
        }

        else if (num_guess != num_random){
            System.out.println(String.format("The correct number is %s", num_random));
        }

        

    }
}