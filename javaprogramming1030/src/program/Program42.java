package program;

public class Program42 {
	public static int[] mergeArr(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];

		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}

	public static void main(String[] args) {
		int a[]={12,3,4,78,9,56,78,90};
		int b[]={67,122,345};
		int result[]=mergeArr(a,b);
		System.out.println("the elements inside array are: ");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}

	}

}
