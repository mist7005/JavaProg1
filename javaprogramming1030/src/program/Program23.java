package program;
import java.util.Scanner;
public class Program23 {

	static int sumSquare(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum = sum +(d*d);
			x=x/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int ss=sumSquare(n);
		System.out.println("sum of square of digit is: "+ss);

	}

}
