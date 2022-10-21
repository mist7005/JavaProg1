package program;
import java.util.Scanner;
public class Program14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 4 subject marks");
		int c=sc.nextInt();
		int p=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		int total=c+p+m+b;
		float perc=total/400f*100;
		if(c>=35&&p>=35&&m>=35&&b>=35)
		{
			System.out.println("PASS");
			System.out.println(total);
			System.out.println("percentage is : "+perc);
			if (perc>=85)
				System.out.println("distinction");
			if (perc>=60 && perc <85)
				System.out.println("First class");
			if (perc <60&&perc>=50 )
				System.out.println("second class");
			
		}
		else
		 System.out.println("fail");
			
		

	}

}
