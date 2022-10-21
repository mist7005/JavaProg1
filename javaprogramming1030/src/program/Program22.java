package program;
import java.util.Scanner;
public class Program22 {

	static int sumFirstNat(int x)
	{
		int s= x*(x+1)/2;
		return s;
	}
	
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
    int s=sumFirstNat(n);
    System.out.println("sum is: "+s);
	}

}
