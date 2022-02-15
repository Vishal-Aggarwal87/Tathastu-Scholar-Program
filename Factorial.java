/*
 * Factorial of a number 
 */
import java.util.Scanner;

public class Factorial {
	static double fact(double num)
	{
		if(num<=1)
			return 1;
		else
			return num*fact(num-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		double num = scanner.nextDouble();
		if(num<0)
		{
			System.out.println("Invalid Input.");
			scanner.close();
			return;
		}
		System.out.print("Factorial of " + (int)num + " is " + fact(num));
		scanner.close();
	}

}
