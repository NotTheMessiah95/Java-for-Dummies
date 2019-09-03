/*Further scanner usage for integers, decimals, and strings. Will try some calculations at the end?*/

import java.util.Scanner;

public class scanner
{
	public static void main (String[] args)
	{
      //Declaring variables to be used for scanner. int is a number, double is a decimal, String is text
      int intNum;
      double decimalNum;
      String text;
      
      //Brings scanner named sc into the class to be used for keyboard input
      Scanner sc = new Scanner (System.in);
      
      //Asks for and gets input for whole number/integer - for intNum
      System.out.println("Please enter a whole number.");
      intNum=sc.nextInt();
      
      //Asks for and gets input for decimal number (the double data type) - for decimalNum
      System.out.println("Please enter a decimal number.");
      decimalNum=sc.nextDouble();
      
      
      //Asks for and gets input for the text string - for variable 'text'
      System.out.println("Please enter a word.");
      text = sc.next();
      
      
      //Prints out the input data
      System.out.println("The number entered was " +intNum);
      System.out.println("The decimal entered was "+decimalNum);
      
      //To put quotation marks around the output text, an escape sequence needs to be used, as double quotation marks are special in Java
      //This gives extra instructions to the compiler
      //In this example, we need to use the \" escape sequence. This creates a quotation mark directly after the sequence
      //In this command then, "\""+text+"\"" will output the text variable input by the user surrounded by quotation marks
      
      System.out.println("The text entered was: " + "\""+text+"\"");
      
      //This is a quick calculation that multiplies the two numbers entered
      //The \n at the start of the text string takes a new line; this is another escape sequence like the \" used above
      System.out.println("\nThe product of the whole number and the decimal is " +intNum*decimalNum);
      
      
  }
}
