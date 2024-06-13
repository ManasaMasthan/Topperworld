import java.util.Random;
import java.util.Scanner;

public class numberguessing
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber=random.nextInt(100)+1;
        int maxAttempts=5;
        int attempts=0;
        boolean hasGuessedCorrectly=false;

        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Guess Number Game.");
        System.out.println();
        System.out.println("You Will Be Asked To Guess A Number To Win The Game.");
        System.out.println();
        System.out.println("You have Maximum 5 Attempts Limit");
        System.out.println();
       while(attempts<maxAttempts && !hasGuessedCorrectly){
        System.out.println("Enter a guess number between 1 to 100:");
        int playerGuess=scanner.nextInt();
        attempts++;

        if(playerGuess==randomNumber){
            hasGuessedCorrectly=true;
            System.out.println("OOhhoo! Your Number is Correct.You Win the Game!");
        }
        else if(randomNumber > playerGuess)
        {
            System.out.println("Your Guess Number is Greater");
        }
        else{
            System.out.println("Your Guess Number is Smaller.");
        }
    }
    if (!hasGuessedCorrectly) {
        System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
    }

           scanner.close();
    }
    
}