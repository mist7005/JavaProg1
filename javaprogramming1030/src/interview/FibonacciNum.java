package interview;

public class FibonacciNum {

	public static void main(String[] args) {
		fibNum1(4 );
//		System.out.println(StringBack("today is monday"));
		System.out.println(stringRev("monday is today"));
		stringRev1("monday is today");
		fibonacciSeries(4);
		System.out.println();
		fibNum1(4 );


	}
	public static void fibNum(int x)
	{
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for (int i = 3; i <= x; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
	public static void fibNum1(int x)
	{
		int a=0;
		int b=1;
		int c;
//		System.out.print(a+" "+b);
		for (int i = 1; i <= x; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	public static void fibonacciSeries(int n)
	{
		int num1=0; int num2=1;
		int counter=0;
		while(counter<n)
		{
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			counter++;
		}
	}
	
	public static String stringBack(String s)
	{
		String a[]=s.split(" ");
		String rev="";
		for (int i = a.length-1; i >=0; i--) {
			rev=rev+a[i]+" ";
		}
		return rev;	
	}
	public static String stringRev(String x)
	{
		String s="";
		for (int i = x.length()-1; i >=0; i--) {
			s=s+x.charAt(i);
		}
		return s;
	}
	public static void stringRev1(String x)
	{
		String c[]=x.split(" ");
		String rev="";
		for (int i = 0; i < c.length; i++) {
			rev=rev+stringRev(c[i])+" ";
			System.out.println(rev);
		}
		System.out.println(rev);
	}
}