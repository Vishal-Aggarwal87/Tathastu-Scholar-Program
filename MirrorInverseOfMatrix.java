/*
 * Mirror Inverse of Matrix
    arr[] = [3, 4, 2, 0, 1} 
	Output: Yes 
	Given :: 
	index(0) -> value(3) 
	index(1) -> value(4) 
	index(2) -> value(2) 
	index(3) -> value(0) 
	index(4) -> value(1) 
	To find the inverse of the array, swap the index and the value of the array :: 
	index(3) -> value(0) 
	index(4) -> value(1) 
	index(2) -> value(2) 
	index(0) -> value(3) 
	index(1) -> value(4)
	Inverse arr[] = {3, 4, 2, 0, 1}
 */
import java.util.Scanner;

public class MirrorInverseOfMatrix {
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr[i]] != i)
				return false;
		}
		return true;
	}
	static void printMatrix(int []arr)
	{
		for(int i=0; i<arr.length; i++) 
		{
				System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in array ::");
		int n = scanner.nextInt();
		int[]arr = new int[n];
		for(int i=0; i<n; i++) 
		{
				arr[i] = scanner.nextInt();
		}
		System.out.print("Given Array :: ");
		printMatrix(arr);
		if (isMirrorInverse(arr))
			System.out.println("Yes, It's a Mirror Inverse of given Array.");
		else
			System.out.println("No, It's not a Mirror Inverse of given Array.");
		scanner.close();
	}
}
