package program;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of wire in cm");
		float length=sc.nextFloat();
		float feets=0.0394f;
		float inches=0.0394f;
		float metres=0.01f;
		
		System.out.println("feet "+length*feets);
		System.out.println("inches"+length*inches);
		System.out.println("metres"+length*metres);

	}

}
