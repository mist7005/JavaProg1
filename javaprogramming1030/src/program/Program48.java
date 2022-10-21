package program;

public class Program48 {
	static int[] zigZag(int x[],int y[])
	{
		int lox=0;
		int loy=0;
		int ar[]=new int[x.length+y.length];
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				ar[i]=x[lox];
				lox++;
		}
			else
			{
				ar[i]=y[loy];
				loy++;
			}
		}
		
		return ar;
	}

	public static void main(String[] args) {
		int a[]= {4,6,7,8};
		int b[]= {5,12,4};
		int in=3;
		int ar[]=zigZag(a,b);
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}

	}

}
