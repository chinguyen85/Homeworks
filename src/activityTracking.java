import java.util.Scanner;

public class activityTracking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		String level = in.nextLine();
		int sum = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Minutes on " + (i + 1) + ". day?");
			int amount = Integer.parseInt(in.nextLine());
			sum += amount;	
			}
		
		System.out.println("How many times you did muscle strengthening and balance activities?");
		int time = Integer.parseInt(in.nextLine());
		
		System.out.println("You did " + sum + " minutes " + level + " exercise during week.");
	
		if (level.equalsIgnoreCase("vigorous") && sum >= 75 && time >= 2 || level.equalsIgnoreCase("moderate") && sum >= 150 && time >= 2)
		{
			System.out.println("You exercise enough according to the recommendations!");
	    }
		else {
	        System.out.println("You should exercise more!");
		}
	}
	
	public static void checkActivityRecommendation(String activityLevel, int amount, int time) {
		
		if ((activityLevel.equalsIgnoreCase("vigorous") && amount >= 75 && time >= 2) || (activityLevel.equalsIgnoreCase("moderate") && amount >= 150 && time >= 2))
			{
			System.out.println("You exercise enough according to the recommendations!");
		    }
		else {
		        System.out.println("You should exercise more!");
		}
	}
}
