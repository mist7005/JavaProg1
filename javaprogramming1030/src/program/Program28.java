package program;

import java.util.Scanner;

public class Program28 {
	
	static boolean isPrime(int x)
	{
		if (x==1||x<0)
			return false;
		else
		{
		int i=2;
		int count=0;
		while(i<x)
		{
			if(x%i==0)
			{
				count++;
	            i++;
			}
			else
				break;
		}
		if (count==0)
			return true;
		else
			return false;
		
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		boolean result=isPrime(a);
		System.out.println("is prime : "+result);

	}

}
