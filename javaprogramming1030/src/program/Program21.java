package program;
import java.util.Scanner;
public class Program21 {

	static int factorial(int x)
	{
		int mul=1;
//		int m=x;
		while (x!=0)
		{
			mul=mul*x;
			x--;
		}
		return mul;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
        int s=factorial(n);
        System.out.println("factorial is: "+s);
        
	}

}
