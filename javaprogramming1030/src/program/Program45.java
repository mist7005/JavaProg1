package program;

public class Program45 {
	static int countPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%2==0)
				return 0;
			
		}
		return 1;
		
	}
	static int countPrimeArr(int x[])
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			count=count+countPrime(x[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		int a[]= {11,11,2,3,41,71,83,4,6};
		int result=countPrimeArr(a);
		System.out.println("the number of prime number is: "+result);

	}

}
