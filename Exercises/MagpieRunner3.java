import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3
{

 /**
  * Create a Magpie, give it user input, and print its replies.
  */
 public static void main(String[] args)
 {
  Magpie3 maggie = new Magpie3();


  Scanner in = new Scanner (System.in);
  String statement = in.nextLine();

  while (!statement.equals("Bye"))
  {
   statement = in.nextLine();
  }
 }

}