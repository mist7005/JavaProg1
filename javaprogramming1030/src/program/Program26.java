package program;
import java.util.Scanner;
public class Program26 {

	static int checkBig(int x,int y,int z)
	{
		int big=x;
		if (y>big)
			big=y;
		if (z>big)
			big=z;
		return big;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=checkBig(a,b,c);
		System.out.println("biggest is: "+result);

	}

}
