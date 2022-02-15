/*
 * Palindrome of a string 
 * Example :: madam
 */
import java.util.Scanner;

public class PalindromeString {
	private static boolean isPalindrome(String str) 
	{
		int length = str.length();
		int i=0;
		while(i<length/2) {
			if(str.charAt(i) != (str.charAt(length-i-1)))
					return false;
			i++;
		}
			return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any string :: ");
		String str = scanner.next();
		if(isPalindrome(str))
			System.out.println("It's a Palindrome String.");
		else
			System.out.println("It's not a Palindrome String.");
		scanner.close();
	}
}
