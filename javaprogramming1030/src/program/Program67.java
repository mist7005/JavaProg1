package program;

public class Program67 {
	static int[][] rotateRight(int c[][])
	{
		int x[][]=Program66.transpose(c);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length/2;j++)
			{
				int temp=x[i][j];
				x[i][j]=x[i][x[0].length-1-j];
				x[i][x[0].length-1-j]=temp;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Mat ob=new Mat();
		int mt[][]=ob.readMat();
		int fm[][]=rotateRight(mt);
		System.out.println("user entered matrix: ");
		ob.dispMat(mt);
		System.out.println("matrix after rotating 90 degree right");
		ob.dispMat(fm);
	}

}
