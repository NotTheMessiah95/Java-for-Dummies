/*This is the most basic thing you can do in Java (probably) - a simple command to print out text
As well as this, just for the hell of it, some variables will also be declared, instantiated and printed.
Concatenation (joining together strings) will also be demonstrated.
*/


class HelloWorld {
  public static void main(String[] args) {
    //System.out.print simply prints out some text. Note that, when ran, the next command simply adds on to the previous
    System.out.print("Hello World");
    System.out.print("This is a basic Java command!");
    //To take a new line, we use System.out.println. This takes a new line at the end of the output string.
    System.out.println("This command creates a new line");
    System.out.println("Notice that a new line has been taken!");
    
    //We can use variables to have a bit more control over what the output is, and to save time.
    //Notice that quotation marks aren't needed when printing a string variable.
    
    //The next line declares the variable, i.e. brings it into existence - String simply means the variable will be text based
    String Text1;
    //The next line gives the variable a value - in this case a string of text
    Text1 = "This is an example of a variable.";
    
    System.out.println(Text1);
    
    //Variables can also be declared and instantiated (given value) in one line, rather than splitting over two
    String Text2 = "This variable is declared and instantiated on one line";
    System.out.println(Text2);
    
    //To join together strings, we can concatenate - a + sign is used to join things together.
    //This works for normal text as well as variables
    
    String language = "Java";
    
    System.out.println("I am learning " + language + " today!");
  }
}
