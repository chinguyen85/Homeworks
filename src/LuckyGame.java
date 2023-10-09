import java.util.Random;
import java.util.Scanner;

public class LuckyGame {

	public static void main(String[] args) {
		Random num = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("How much do you want to spend?");
		int cash = Integer.parseInt(in.nextLine());
		boolean rePlay = true;
		
		while (cash > 0 && rePlay) {
			cash -= 1;
			int num1 = num.nextInt(10) + 1;
			int num2 = num.nextInt(10) + 1;
			int num3 = num.nextInt(10) + 1;
			
			System.out.println("Your random numbers: " + num1 + ", " + num2 + ", " + num3);
			
			if (num1 == 7 || num2 == 7 || num3 == 7)
			{
				if (num1 == 7 && num2 == 7 && num3 == 7)
				{
					cash += 10;
					System.out.println("You won 10€!");
				}
				else if (num1 == 7 || num2 == 7 || num3 == 7)
				{
					cash += 3;
					System.out.println("You won 3€!");
				}
				else
				{
					cash += 5;
					System.out.println("You won 7€!");
				}
			}
			else
			{
				System.out.println("You lost!");
			}
			System.out.println("Your current balance is: " + cash + "€.");
			System.out.println("Do you want to play again? (If yes, type 0. If no, type 1.)");
			int answer = Integer.parseInt(in.nextLine());
			rePlay = (answer == 0);
		}
		if (cash <= 0)
		{
			System.out.println("Game over! You spent all money.");
		}
	}
}
