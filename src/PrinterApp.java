
public class PrinterApp {

	public static void main(String[] args) {
		System.out.println("Printer App");
		String creator = "Chi Nguyen";
		System.out.println("This app is made by: " + creator);
		
		int number1 = 7;
		int number2 = 3;
		System.out.println("The value of number1 is " + number1);
		System.out.println("The value of number2 is " + number2);
		
		int multiplication = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + multiplication);
		
		int addition = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + addition);
		
		int division = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + division);
		
		int substraction = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + substraction);
	}

}
