import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayGuess {

    public static void arrayGuessGame(){
        ArrayList<String> largestCountries = new ArrayList<>(); 
            largestCountries.add("Russia");
            largestCountries.add("China");
            largestCountries.add("USA");
          //N.B. These countries might be wrong.
          
        Scanner userInput1 = new Scanner(System.in);
        String countryGuess = userInput1.nextLine();

        System.out.println("Welcome to the guessing game! You have 3 guesses for the largest countries in the world: ");
        for (int i=0;i<2;i++){
            if (largestCountries.contains(countryGuess)){
                System.out.print("Congratulations, you guessed right! "+countryGuess+" is one of the three largest countries. Please enter your next guess: " );
                largestCountries.remove(countryGuess);
            }
            else{
                System.out.print("Sorry, that's not right. Please try again: ");
            }
            countryGuess = userInput1.nextLine();
        }
        System.out.println();
        System.out.println("Thank you for playing. You missed " + largestCountries.size() + " answers.");
    }

    public static void main (String[] args){
        arrayGuessGame();
    }
}
