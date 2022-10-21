package program;

public class Program49 {
	
	static int[] sortArray(int x[],int y[])
	{
		
		int ar[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			ar[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			ar[x.length+i]=y[i];
		}
		int ne[]=new int[ar.length];

		for(int i=0;i<ne.length;i++)
		{
			ne[i]=findSmall(ar);
		}
		return ne;
	}

		static int findSmall(int z[])
		{
		int small=z[0];
		
		for(int i=0;i<z.length;i++)
		{
			if(z[i]<small)
			{
				small=z[i];
			}

		}
		return small;
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,9,10};
		int b[]= {1,2,3};
		int in=3;
		int ar[]=sortArray(a,b);
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}

	}

}
