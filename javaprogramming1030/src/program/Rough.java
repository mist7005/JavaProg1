package program;
import java.util.Scanner;
public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		boolean result=!(year%4==0&&(year%100!=0||year%400==0));
			
		if (result==true)
			System.out.println("not leap");
		else
			System.out.println("leap");

	}

}
