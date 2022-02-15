/*
 * Permutation and Combination of two numbers
 * nPr = factorial(n) / factorial(n-r)
 * nCr = factorial(n)/(factorial(n-r) * factorial(r))
 */
import java.util.Scanner;

public class PermutationCombination {
	static double factorial(double num)
	{
		if(num<=1)
			return 1;
		else
			return num*factorial(num-1);
	}
	public static void main(String[] args) {
		System.out.println("Enter values of n and r ::");
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int r = scanner.nextInt();
		System.out.println("Permutation " + n + "P" + r + " :: " + (factorial(n) / factorial(n-r)));
		System.out.println("Combination " + n + "C" + r + " :: " + factorial(n)/(factorial(n-r) * factorial(r)));
		scanner.close();
	}
}
