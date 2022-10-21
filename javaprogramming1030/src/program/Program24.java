package program;
import java.util.Scanner;
public class Program24 {

	static int productDigit(int x)
	{
		int prod=1;
		do
		{
			int d=x%10;
			prod = prod*d;
			x=x/10;
		}while(x!=0);
		return prod;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int ss=productDigit(n);
		System.out.println("product of digit is: "+ss);
		

	}

}
