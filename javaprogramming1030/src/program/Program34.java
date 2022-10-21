package program;
import java.util.Scanner;
public class Program34 {
	
	static boolean isHappy(int x)
	{
		int result=0;
		int temp=x;
		while(temp!=0)
		{
			int d=temp%10;
			result=result+d*d;
			temp=temp/10;
		}
		int store=result;
		int fin=0;
		while(store!=0)
		{
			int c=store%10;
			fin=fin+c*c;
			store=store/10;
		}
		if (fin==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		boolean ss = isHappy(a);
		System.out.println("number is happy: "+ss);

	}

}
