package program;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = sc.nextInt();
		if (num%4==0&&num%3==0&&num%5==0)
		System.out.println(num+" it is divisible");
		else
		System.out.println("it is not divisible");


	}

}
