package interview;

public class NumPalindrome {

	public static void main(String[] args) {
		boolean a=isPalindrome(121);
		System.out.println(a);

	}
	public static int revNum(int x)
	{	
		int rev=0;
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int x)
	{
		int a=revNum(x);
		return x==a;
	}

}
