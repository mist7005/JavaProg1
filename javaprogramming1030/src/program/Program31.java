package program;
import java.util.Scanner;
public class Program31 {
	
	static int countPrime(int x)
	{
		int count=0;
		do {
		int d=x%10;
		count=count+isPrime(d);
		x=x/10;
		}while(x!=0);
		return count;
	}
	static int isPrime(int x)
	{
		for(int i=2;x/2%2==0;i++)
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int ss=countPrime(a);
		System.out.println("the number of prime number is: "+ ss);
		

	}

}
