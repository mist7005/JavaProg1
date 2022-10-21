package interview;

public class PrimeStartEnd {

	public static void main(String[] args) {
//		printPrime(1, 30);
		primeLong(23);

	}
	public static boolean isPrime(int x)
	{	
		for (int i = 2; i <= x/2; i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void printPrime(int start,int end)
	{
		for (int i = start; i < end; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static void primeLong(int x)
	{
		int cP=0;
		for (int i = 2; i <= x/2; i++) {
			if(x%i==0)
			{
				cP++;
				break;
			}
//			else if(x%i==0)
//				System.out.println(x+"---prime");
		}
		if(cP>0)
		{
			System.out.println(x+" not prime "+cP);
			
		}
		else
			System.out.println(x+" is prime "+cP);
	}
}
