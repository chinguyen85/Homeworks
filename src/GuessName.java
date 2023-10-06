import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int i = 0;
        String nameGuess;
        
        do {
            System.out.println("Guess my name (type stop to exit)");
            nameGuess = in.nextLine();
            i++;

            if (nameGuess.equalsIgnoreCase("Emma")) {
                System.out.println("Congratulations!");
                break; // Exit the loop if the guess is correct
            } else if (nameGuess.equalsIgnoreCase("stop")) {
            	System.out.println("You guessed " + i + " times.");
                break; // Exit the loop if the user wants to stop
            }
        } while (true);
        if (!nameGuess.equalsIgnoreCase("stop")) {
        	System.out.println("You guessed " + i + " times.");
        }
    }
}