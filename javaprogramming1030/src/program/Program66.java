package program;

public class Program66 {
	
	static int [][] transpose(int x[][])
	{
		int z[][]=new int[x[0].length][x.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				z[j][i]=x[i][j];
			}
		}
		return z;
	}
	
	static int[][] rotateLeft(int c[][])
	{
		int y[][]=transpose(c);
		for(int i=0;i<y.length/2;i++)
		{
			for(int j=0;j<y[0].length;j++)
			{
				int temp=y[i][j];
				y[i][j]=y[y.length-1-i][j];
				y[y.length-1-i][j]=temp;
			}
		}
		return y;	
	}
	public static void main(String[] args) {
		Mat ob=new Mat();
		int m[][]=ob.readMat();
		System.out.println("the user entered matrix is: ");
		ob.dispMat(m);
		int fm[][]=rotateLeft(m);
		System.out.println("matrix after rotating 90 degree left: ");
		ob.dispMat(fm);
	}
}
