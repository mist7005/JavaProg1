package program;
import java.util.Scanner;
public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month number");
		int month = sc.nextInt();
		if(month>=1&&month<=12)
			System.out.println("valid month");
		else
			System.out.println("invalid month");

	}

}
