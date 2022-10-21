package program;

public class Program43 {
	
	static int[] checkPoNe(int x[])
	{
		int po=0;
		int ne=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>0)
				po++;
			else
				ne++;
		}
		int ar[]= {po,ne};
		return ar;
	}

	public static void main(String[] args) {
		int a[]= {-12,-14,56,67,-91};
		int result[]=checkPoNe(a);
		System.out.println("the count of positive number is: "+result[0]);
		System.out.println("the count of negative number is: "+result[1]);

	}

}
