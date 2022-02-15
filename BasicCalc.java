/*
 * Basic Calculator
 * Operations include +,-,*,/,%
 */
import java.util.Scanner;

public class BasicCalc {
	static double addition(double a,double b)
	{
		return a+b;
	}
	static double subtraction(double a,double b)
	{
		return a-b;
	}
	static double multiplication(double a,double b)
	{
		return a*b;
	}
	static double division(double a,double b)
	{
		if(b==0)
			System.out.println("Invalid Input.");
		return a/b;
	}
	static double modulo(double a,double b)
	{
		return a%b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t Basic Calculator");
		System.out.println("Operations:\n 1.Addition(+)\n 2.Subtraction(-)\n 3.Division(/)\n 4.Multiplication(x)\n 5.Modulus(%)");
			System.out.println("Enter two numbers:");
			double num1 = scanner.nextDouble();
			double num2 = scanner.nextDouble();
			System.out.print("Enter Choice: ");
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Result :: "+ addition(num1,num2));
					break;
				case 2:
					System.out.println("Result :: "+ subtraction(num1,num2));
					break;
				case 3:
					System.out.println("Result :: "+ division(num1,num2));
					break;
				case 4:
					System.out.println("Result :: "+ multiplication(num1,num2));
					break;
				case 5:
					System.out.println("Result :: "+ modulo(num1,num2));
					break;
				default:
					System.out.println("Invalid Input.");
			}
			scanner.close();
	}

}
