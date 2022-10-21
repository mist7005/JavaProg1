package program;

import java.util.Scanner;
public class Program27 {
	
	static boolean checkSpecial(int x)
	{
		int d1=x/10;
		int d2=x%10;
		int s=d1+d2+d1*d2;
		if (s==x)
			return true;
		else
			return false;
			
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 2 digit number");
		int a=sc.nextInt();
		boolean result=checkSpecial(a);
		System.out.println("is special: "+result);

	}

}
