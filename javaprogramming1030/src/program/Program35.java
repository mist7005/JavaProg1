package program;
import java.util.Scanner;
public class Program35 {
	
	static boolean isArmstrong(int x)
	{
		int count=checkCount(x);
		int temp=x;
		int sum=0;
		while(temp!=0)
		{
			int c=temp%10;
			sum=sum+power(c,count);
			temp=temp/10;
		}
		if(sum==x)
			return true;
		else
			return false;
	}
	static int checkCount(int y)
	{
		int c=0;
		while(y!=0)
		{
			y=y/10;
			c++;
		}
		return c;
	}
	static int power(int z,int b)
	{
		int xx=1;
		while(b>0)
		{
			
			xx=xx*z;
			b--;
		}
		return xx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		boolean ss=isArmstrong(a);
		System.out.println("is armstrong: "+ss);

	}

}
