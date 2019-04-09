import java.util.Scanner;

public class JavaLesson
{

  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args)
  {

    System.out.print("Your favorite number: ");

    if (userInput.hasNextInt())
    {
      int numberEntered = userInput.nextInt();

      System.out.println("You entered " + numberEntered);

      int numberEnteredTimes2 = numberEntered + numberEntered;
      System.out.println(numberEntered + numberEntered);

    } else {

      System.out.println("Entered  an integer next time");

    }

  }

}