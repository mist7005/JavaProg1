package program;

public class Program63 {
	
	static boolean isPrime(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
	
	static int countPrime2dArr(int mat[][])
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				boolean x=isPrime(mat[i][j]);
				if(x==true)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
	   Mat ob=new Mat();
	   int mat[][]=ob.readMat();
	   System.out.println("user entered matrix");
	   ob.dispMat(mat);
	   
	   int count=countPrime2dArr(mat);
	   System.out.println("the prime count is "+ count);
		
	}
}
