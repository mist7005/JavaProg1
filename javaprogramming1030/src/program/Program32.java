package program;
import java.util.Scanner;
public class Program32 {

	static int pow(int n,int p)
	{
		int result=1;
		while(p!=0)
		{
			result=result*n;
			p--;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ss=pow(a,b);
		System.out.println(ss);

	}

}
