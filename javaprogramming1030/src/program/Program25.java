package program;
import java.util.Scanner;
public class Program25 {

	static int reverseNum(int x)
	{
//		String rev="";
		int rev=0;
		while(x!=0)
		{
		int d=x%10;
//		rev=rev+Integer.toString(d);
		rev=rev*10+d;
		x=x/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to reverse");
		int n=sc.nextInt();
		int ss=reverseNum(n);
		System.out.println("the reverse is: "+ss);

	}

}
