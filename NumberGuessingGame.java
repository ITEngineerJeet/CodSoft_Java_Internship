/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;

/**
 *
 * @author HP
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        System.out.println("The NUMBER GUESSING GAME");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10; // Number of attempts allowed
        
        int score = 0; // Initialize score for multiple rounds
        
        boolean playAgain = true;
        
        while (playAgain) 
        {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");
            
            boolean guessedCorrectly = false;
            int attempts = 0;
            
            while (!guessedCorrectly && attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess < generatedNumber) {
                    System.out.println("Your guess is too low.");
                } else if (guess > generatedNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts.");
                System.out.println("The correct number was: " + generatedNumber);
            }
            
            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            
            if (!playChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing!");
            }
        }
        
        scanner.close();
    }
}

/* Output of this Code 
The NUMBER GUESSING GAME
Welcome to the Number Guessing Game!
I have chosen a number between 1 and 100.
You have 10 attempts to guess it.
Enter your guess: 70
Your guess is too high.
Enter your guess: 50
Your guess is too high.
Enter your guess: 40
Your guess is too high.
Enter your guess: 20
Your guess is too low.
Enter your guess: 35
Your guess is too high.
Enter your guess: 28
Congratulations! You've guessed the correct number.
Your score: 1
Do you want to play again? (yes/no): no
Thank you for playing!
*/