package program;
import java.util.Scanner;
public class Program30 {

	static boolean isPerfect(int x)
	{
		int i=1;
		int sum=0;
		while(i<x)
		{ 
			if(x%i==0)
				sum=sum+i;
				i++;
		}
		if(sum==x)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		boolean result=isPerfect(a);
		System.out.println("is perfect: "+result);

	}

}
