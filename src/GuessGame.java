import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int i = 0;
        String nameGuess;
        String answer;
        
        do {
            System.out.println("Please, guess my name.");
            nameGuess = in.nextLine();
            i++;

            if (nameGuess.equalsIgnoreCase("Katie")) {
            	System.out.println("Congratulations!");
            	break;
            }
            
            do {
            	System.out.println("Do you want to quit (y/n)?");
            	answer = in.nextLine();
            	
            	if (answer.equalsIgnoreCase("y")) {
            		System.out.println("Thank you for playing!");
            		System.exit(0);
            	}
            	else if (!answer.equalsIgnoreCase("n")) {
            		System.out.println("Invalid answer. Please choose y or n!");
            	}
            } while (!answer.equalsIgnoreCase("n"));
            
        } while(true);
        System.out.println("You guessed " + i + " times.");
        }
}