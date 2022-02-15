/*
 * Transpose of a given Matrix 
 * Example ::
 *  Given Matrix ::
	1  2  3  
	4  5  6  
	Transpose of Matrix ::
	1  4  
	2  5  
	3  6  
 * 
 */
import java.util.Scanner;

public class TransposeMatrix {
	private static void transposeOfMatrix(int[][] arr, int[][] transArr, int rows, int col) {
		int i, j;
        for (i = 0; i < col; i++)
            for (j = 0; j < rows; j++)
                transArr[i][j] = arr[j][i];
	}
	
	private static void printMatrix(int[][] arr,int rows, int col) {
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns ::");
		int rows = scanner.nextInt();
		int col = scanner.nextInt();
		int[][]arr = new int[rows][col];
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Given Matrix ::");
		printMatrix(arr,rows,col);
		
		int[][]transArr = new int[col][rows];
		transposeOfMatrix(arr,transArr,rows,col);
		
		System.out.println("Transpose of Matrix ::");
		printMatrix(transArr,col,rows);
		scanner.close();
	}
}
