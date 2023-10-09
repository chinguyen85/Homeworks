
public class PrinterApp {

	public static void main(String[] args) {
		String creator = "Chi Nguyen";
		int number1 = 7;
		int number2 = 3;
		int multiplication = number1 * number2;
		int addition = number1 + number2;
		int division = number1 / number2;
		int substraction = number1 - number2;
		
		System.out.println("Printer App");
		System.out.println("This app is made by: " + creator);
		
		
		System.out.println("The value of number1 is " + number1);
		System.out.println("The value of number2 is " + number2);
		
		
		System.out.println(number1 + " * " + number2 + " = " + multiplication);
		System.out.println(number1 + " + " + number2 + " = " + addition);
		System.out.println(number1 + " / " + number2 + " = " + division);
		System.out.println(number1 + " - " + number2 + " = " + substraction);
	}
}
