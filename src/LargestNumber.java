import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int num1, num2, max;
		 
        /*Input two numbers*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
 
        num1 = sc.nextInt();
        num2 = sc.nextInt();
 
        /*check whether a is greater than b or not*/
        if (num1 > num2)
            max = num1;
        else
            max = num2;
 
        /*Print the largest number*/
        System.out.println(max);
    }
}