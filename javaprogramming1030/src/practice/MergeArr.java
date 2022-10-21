package practice;

import java.util.Iterator;

public class MergeArr {
	
	static int[] mergeArr(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < c.length; i++) {
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[i-b.length-1];
		}
		return c;
	}
	
	public static int[] con(int x[],int y[])
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
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {5,6,7,8};
		int x[]=mergeArr(a,b);
		for (int i = 0; i < x.length; i++) {
		System.out.print(x[i]+" ");
		}

	}

}
