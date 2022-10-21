package program;

public class Program70 {
	static int[][] revDiag(int x[][])
	{
		if(x.length!=x[0].length)
		{
			System.out.println("enter a square matrix");
			return null;
		}
		int z[][]=x;
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[0].length/2;j++)
			{
				if(i==j||i+j==z.length-1)
				{
					int temp=z[i][j];
					z[i][j]=z[z.length-1-i][z.length-1-j];
					z[z.length-1-i][z.length-1-j]=temp;
				}
			}
		}
		return z;
		
		
	}

	public static void main(String[] args) {
		Mat ob=new Mat();
		int mt[][]=ob.readMat();
		int fm[][]=revDiag(mt);
		System.out.println("user entered matrix: ");
		ob.dispMat(mt);
		System.out.println("matrix after reversing diagonal: ");
		ob.dispMat(fm);
	}
}
