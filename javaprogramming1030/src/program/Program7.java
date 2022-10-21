package program;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in celcius");
		float celcius=sc.nextFloat();
		float farenheit=1.8f*celcius+32;
		float kelvin=celcius+273f;
		
		
		System.out.println("farenheit "+farenheit);
		System.out.println("kelvin "+kelvin);
		

	}

}
