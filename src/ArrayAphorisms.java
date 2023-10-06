import java.util.Scanner;

public class ArrayAphorisms {

	public static void main(String[] args) {
		String[] aphorisms = {
	            "Actions speak louder than words.",
	            "A barking dog never bites.",
	            "A penny saved is a penny earned.",
	            "All things come to those who wait."
	        };
		
		// Ask users to choose a number
		System.out.println("Pick number from 1-4.");
		Scanner in = new Scanner(System.in);
		int userInput = in.nextInt();
		
		// Print the corresponding aphorism
		System.out.println(aphorisms[userInput - 1]);

	}

}
