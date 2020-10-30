package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        // write your code here
        Random integer = new Random();
        int guessNumber = integer.nextInt(11);

        Scanner userInput = new Scanner(System.in);

        int userGuess;
        boolean valid = false;

        System.out.print("Please enter a number between 1 and 10: ");
        while (!valid) {
            try {
                userGuess = userInput.nextInt();
                while (userGuess != guessNumber) {
                    System.out.println("Sorry, that was not correct - please guess again: ");
                    userGuess = userInput.nextInt();
                }
                valid=true;
            } catch (Exception e) {
                System.out.print("You have not entered a number. Please try again: ");
                userInput.nextLine();
            }
        }

        System.out.println("Congratulations, you guessed " + guessNumber + " correctly!");
    }
}
