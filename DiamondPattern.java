/*
 * Diamond Pattern 
		  	*
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *

 */
import java.util.Scanner;
public class DiamondPattern
{
    public static void main(String args[]) 
    {
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++) // upper triangle
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) // lower triangle
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}