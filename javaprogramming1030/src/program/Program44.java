package program;

public class Program44 {
	static int[] sumEvOd(int x[])
	{
		int sumEv=0;
		int sumOd=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				sumEv=sumEv+x[i];
			else
				sumOd=sumOd+x[i];
		}
		int ar[]= {sumEv,sumOd};
		return ar;
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int result[]=sumEvOd(a);
		System.out.println("the sum of even number is: "+result[0]);
		System.out.println("the sum of odd number is: "+result[1]);

	}

}
