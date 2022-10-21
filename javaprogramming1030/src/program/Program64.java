package program;

public class Program64 {
	static int[][] addMat(int x[][],int y[][])
	{	
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("matrix is not same");
			return null;
		}
		int mat[][]= new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				mat[i][j]=x[i][j]+y[i][j];
			}
		}
		
		return mat;

	}


	public static void main(String[] args) {
		Mat ob = new Mat();
		System.out.println("enter first matrix");
		int mat1[][]=ob.readMat();
		System.out.println("enter second matrix");
		int mat2[][]=ob.readMat();
		System.out.println("matrix 1");
		ob.dispMat(mat1);
		System.out.println("matrix 2");
		ob.dispMat(mat2);
		int fMat[][]=addMat(mat1,mat2);
		if(fMat==null)
		{
			System.out.println("not possible to add");
		}
		else
		{
		System.out.println("the addition of two matrix");
		ob.dispMat(fMat);
		}
	}

}
