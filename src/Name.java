/*This is a super basic file to get text input from the user, and use that input in a message displayed on screen
As well as the normal class used in a hello world, a further class is used in the Scanner utility which is imported at the beginning.
This allows the Scanner to be used to capture keyboard input in further classes.
*/

//Imports Scanner utility so it's ready for use in the program - this is done before the class declaration
import java.util.Scanner;

class name {
  public static void main(String[] args) {
    //Declare name variable which will be filled by the keyboard input
    String name;
    
    //Initialises scanner object sc - to be used to fill above variable. I'm 99% sure sc could be renamed something else for clarity.
    Scanner sc = new Scanner(System.in);
    
    //Prints out prompt for user to enter name
    System.out.println("Please enter your name.");
    
    //Gets keyboard input to instantiate name variable
    name = sc.next();
    
   //Prints out a string of text plus the name variable which has been filled with the users keyboard input
    System.out.println("Hello, "+name);
    
  }
}
