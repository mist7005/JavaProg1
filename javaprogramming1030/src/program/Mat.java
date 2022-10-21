package program;
import java.util.Scanner;

public class Mat {

	int [][] readMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements row-wise");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	void dispMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
		System.out.println();
	}
}
}
