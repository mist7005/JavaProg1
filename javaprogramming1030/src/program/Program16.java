package program;
import java.util.Scanner;
public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if((num>=-999&&num<=-100)||(num>=100&&num<=999))
			System.out.println("its is a 3 digit number");
		else
			System.out.println("it is not a 3 digit number");
		

	}

}
