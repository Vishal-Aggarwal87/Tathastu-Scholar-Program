/*
 * Fibonacci Series 
 * 0 1 1 2 3 5....
 * 
 */
import java.util.Scanner;

public class FiboSeries {
	static int fibo(int num)
	{
		if(num==1)
			return 0;
		else if(num==2)
			return 1;
		else
			return fibo(num-1) + fibo(num-2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = scanner.nextInt();
		System.out.print("Fibonacci Series :: ");
		for(int i=1; i<=n; i++)
		{
			int value = fibo(i);
			System.out.print(value + "  ");
		}
		scanner.close();
	}
}
