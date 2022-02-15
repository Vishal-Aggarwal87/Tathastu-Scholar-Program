/*
 * To Find Reverse of String
 */
import java.util.Scanner;

public class ReverseString {
	static String reverseString(String str)
	{
		char ch;
		String revStr = "";
		for (int i=0; i<str.length(); i++)
	      {
	        ch = str.charAt(i); 
	        revStr= ch+ revStr; 
	      }
		return revStr;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any string :: ");
		String str = scanner.next();
		System.out.print("Reverse String :: " + reverseString(str));
		scanner.close();
	}
}
