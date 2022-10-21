package program;
import java.util.Scanner;
public class Program33 {

	static int avg(int x)
	{ 
		int sum=0;
		int count=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d;
			count++;
			x=x/10;
			
			}
		int average=sum/count;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int ss=avg(n);
		System.out.println("the average is : "+ss);

	}

}
