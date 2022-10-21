package program;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = sc.nextInt();
		if ((num>=-99&&num<=-10)||(num>=10&&num<=99))
		System.out.println("it is a two digit number");
		else
		System.out.println("it is not a two digit number");

	}

}
