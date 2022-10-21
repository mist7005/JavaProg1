package program;

public class Program50 {
	
	static int[] sumOfElement(int x[])
	{
		int ar[]=new int[x.length];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sumOfDigit(x[i]);
			
		}
		return ar;
	}
	
	static int sumOfDigit(int z)
	{
		int sum=0;
		
		while(z!=0)
		{
			int d=z%10;
			 sum=sum+d;
			 z=z/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int b[]= {55,12,14};
		int in=3;
		int ar[]=sumOfElement(b);
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}

	}
}