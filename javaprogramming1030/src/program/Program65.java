package program;

public class Program65 {
	
	static int[][] revMat(int x[][])
	{
		int  mat[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{   
			int k=x[0].length-1;
			for(int j=0;j<x[i].length;j++)
			{
				mat[i][j]=x[i][k];
				k--;
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		Mat ob = new Mat();
		int mat[][]=ob.readMat();
		ob.dispMat(mat);
		int rMat[][]=revMat(mat);
		System.out.println("rev matrix");
		ob.dispMat(rMat);

	}

}
