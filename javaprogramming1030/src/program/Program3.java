package program;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int num = sc.nextInt();
		if (num<0)
		{
		 num= num*(-1);
		System.out.println(num+" is positive");
		}
		else
		{
		System.out.println(num+" is positive");
		}
	}

}
