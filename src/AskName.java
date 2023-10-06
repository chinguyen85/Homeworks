import java.util.Scanner;

public class AskName
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Ask for the user's name
        System.out.println("What is your name? ");

        // Read the user's input as a String
        String userName = in.nextLine();

        // Check if the user provided a name
        if (userName.isEmpty())
        {
            System.out.println("Error");
        }
        else
        {
            // Print the user's name
            System.out.println("Your name is " + userName + ".");
        }

        // Close the scanner
        in.close();
    }
}