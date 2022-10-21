package interview;

import java.util.Arrays;

public class BubbleSortProg {

	public static void main(String[] args) {
		int a[]= {4,2,5,1};
		int n=a.length-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
	public static void selecSort(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			int iMin=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[iMin])
					iMin=j;
			}
			int temp=a[i];
			a[i]=a[iMin];
			a[iMin]=temp;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
