import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Ask for the user's name
        System.out.println("What is your name? ");

        // Read the user's input as a String
        String userName = in.nextLine();

        // Ask for the user's age
        System.out.println("How old are you? ");

        // Read the user's input as a String
        String userAge = in.nextLine();
        {
            // Print the user's name and age
            System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
        }

        // Close the scanner
        in.close();
    }
}