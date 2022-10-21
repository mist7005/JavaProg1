package program;

public class Program46 {
	
	static int[] insertArrEle(int x[],int y[],int in)
	{
		int ar[]=new int[x.length+y.length];
		for(int i=0;i<y.length;i++)
		{
			ar[in+i]=y[i];
		}
		for(int i=0;i<in;i++)
		{
			ar[i]=x[i];
		}
		for(int i=0;i<x.length-in;i++)
		{
			ar[in+y.length+i]=x[in+i];
		}
		
	
		return ar;
	}

	public static void main(String[] args) {
		int a[]= {4,6,7,9,8,67,99,226};
		int b[]= {5,12,11,2,1,23};
		int in=3;
		int ar[]=insertArrEle(a,b,in);
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}
	}

}
