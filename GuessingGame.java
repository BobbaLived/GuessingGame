/**
 * Guess Java
 * Jacob Lee
 */
import java.util.Scanner;
public class GuessingGame {
  
  public static void main(String[] args) { 
    //Define variables and create scanner
    Scanner kb = new Scanner(System.in);
    int numToGuess;
    int guess;
    int numOfGuess = 0;
    int numTooLow = 0;
    int numTooHigh = 0;
    int numInvalid = 0;
    
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
        numInvalid++;
    }
      
      //If the number is in the range between 1 and 10, it will follow the script below
      else {
        //if the guess is too large, print this statement
        if(guess > numToGuess) {
          System.out.println("That number is too high!  Try guessing a smaller number below:");
          numTooHigh++;
        }
        //if the guess is too small, print this statement
        else {
          System.out.println("That number is too low!  Try guessing a larger number below:");
          numTooLow++;
        }
        //asks for new number to be enter
      guess=kb.nextInt();
      }
      numOfGuess++;  //add a guess each time they guess incorrect
    } //end of while statement
    
    //If the while statement is not run, that means the person entered the correct number.  Congrats!
    numOfGuess++;  //another numOfGuess because they got it right with their last guess
    System.out.println("Good job!!! " + guess + " was the correct number." +
                         "\nIt took you " + (numOfGuess) + " guess(es) to get the correct answer." + 
                         "\nYou had " + numTooLow + " guess(es) that were too low and " + numTooHigh + 
                         " guess(es) that were too high." + 
                         "\nYou also had " + numInvalid + " guess(es) that were invalid." +  
                         "\nHit run to play again!");
  } 
}