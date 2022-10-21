package projects;
import java.util.Random;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the the length of password you want to generate");
		String le=sc.nextLine();
		generatePass(le);
	}

	public static void generatePass(String le) {
		char c[]=le.toUpperCase().toCharArray();
		String g="1";
		char cap[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Random x=new Random();
//		System.out.println(c);
		int q=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;i<cap.length-1;i++)
			{
				if(c[i]==cap[j])
				{
					g=g+cap[j];
				}
			}
		}
		System.out.println("match"+g);
		
		String op="";
//		for(int i=0;i<le;i++)
//		{
//			op=op+(char)(x.nextInt(26)+'a');
//		}
		System.out.println(op);
	}

}
