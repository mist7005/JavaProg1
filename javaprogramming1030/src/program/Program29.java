package program;

import java.util.Scanner;

public class Program29 {

	static boolean isDateFormat(int dd,int mm,int yy)
	{
		if(yy<1 || dd<1 || dd>31 || mm<1 || mm>12)
			return false;
		else if(mm==4||mm==6||mm==9||mm==11||mm==12&&dd>30)
			return false;
		else if(mm==2&&dd>29)
			return false;
		else if(!(yy%4==0&&(yy%100!=0||yy%400==0))&&mm==2&&dd>28)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date format in 'dd-mm-yyyy' ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean result=isDateFormat(a,b,c);
		System.out.println("format is: "+result);


	}

}
