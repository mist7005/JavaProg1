package interview;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		int a[]= {41,41,1,53,2,7,53};
				ascNum(a);
				secondLarg(a);
			
		
	}
	public static void secondLarg(int a[])
	{
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = a.length-2; i >=0; i--) {
			if(a[i]!= a[a.length-1])
			{
				System.out.println("2nd largest element is "+a[i]);
				return;
			}
		}
		System.out.println("no 2nd largest element");

	}
	public static void ascNum(int x[])
	{
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]<x[j])
				{
					int temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for (int i = 1; i < x.length; i++) {
			if(x[0]!=x[i])
			{
				System.out.println("2nd larg is "+x[i]);
				return;
			}
		}
		System.out.println("no 2nd largest ele");
	}

}
