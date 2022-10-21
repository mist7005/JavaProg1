package program;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		float length=sc.nextFloat();
		System.out.println("enter the breadth");
		float breadth=sc.nextFloat();
		float area=length*breadth;
		float perimeter=2*(length+breadth);
		
		
		System.out.println("area "+area);
		System.out.println("perimeter "+perimeter);
		

	}

}
