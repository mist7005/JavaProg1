package program;
import java.util.Scanner;
public class Program19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in dd/mm/yyyy");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		if((dd>9&&dd<100)&&(mm>9&&dd<100)&&(yyyy>999&&yyyy<10000))
			System.out.println("valid");
		else
			System.out.println("not valid");

	}

}
