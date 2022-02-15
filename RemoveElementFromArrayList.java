/*
 * Removing Element from ArrayList
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElementFromArrayList {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		System.out.print("Enter the number of elements :: ");
		int length = scanner.nextInt();
		while(length!=0)
		{
			list.add(scanner.nextInt());
			length--;
		}
		
		System.out.println("List :: " + list);

		System.out.print("Enter position of element which you want to remove :: ");
		list.remove(scanner.nextInt()-1);

		System.out.print("Updated List :: " + list);
		scanner.close();
	}
}
