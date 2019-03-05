/**
 * Guess JAVA by Jacob Lee
 */
import java.util.Scanner;
public class GuessingGame {
  
  
  public static void main(String[] args) { 
    //Define variables and create scanner
    Scanner kb = new Scanner(System.in);
    int numToGuess;
    int guess;
    int numOfGuess = 0;
    
    numToGuess = (int)(Math.random()*10 + 1); //generates random number between 0 and 10
    
    System.out.println("Try and guess the number I'm thinking of between 1 and 10... ready to play?" + 
                         "\nEnter your guess in the box below!");
    //Box for nextInt started
    guess = kb.nextInt();
    
    while(guess != numToGuess) 
    { //start of while statement
      
      //First checks if the number is out of range, if so it gives them the instructions on how to properly
      //submit a number for game
      if(guess  > 10 || guess < 0) {
        System.out.println("ERROR: Please enter only whole numbers between 1 and 10");
        System.out.println("Try guessing a new number below:");
        guess = kb.nextInt();
    }
      
      //If the number is in the range between 1 and 10, it will follow the script below
      else {
        //if the guess is too large, print this statement
        if(guess > numToGuess) {
          System.out.println("That number is too high!  Try guessing a smaller number below:");
        }
        //if the guess is too small, print this statement
        else {
          System.out.println("That number is too low!  Try guessing a larger number below:");
        }
        //asks for new number to be enter
      guess=kb.nextInt();
      }
      numOfGuess++;
    } //end of while statement
    
    //If the while statement is not run, that means the person entered the correct number.  Congrats!
    System.out.println("Good job!!! " + guess + " was the correct number." +
                         "It took you " + (numOfGuess + 1) + " guess(es) to get the correct answer." + 
                         "\nHit run to play again!");
    
  }
  
}
