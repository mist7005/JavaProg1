package program;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		float r=sc.nextFloat();
		float pi = 3.14f;
		float area = pi * r * r;
		float circumference = 2*pi*r;
		System.out.println("area is: "+ area);
		System.out.println("circumference is: "+ circumference);


	}

}
