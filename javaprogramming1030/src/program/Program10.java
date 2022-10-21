package program;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of square");
		float side=sc.nextFloat();
		float area=side*side;
		float perimeter=4*side;
		
		
		System.out.println("area "+area);
		System.out.println("perimeter "+perimeter);

	}

}
