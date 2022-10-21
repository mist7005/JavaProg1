package interview;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("oyo"));
	}
	public static String revStr(String x)
	{
		char ch[]=x.toCharArray();
		char c[]=new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			c[i]=ch[ch.length-1-i];
		}
		x=new String(c);
		return x;
	}
	public static boolean isPalindrome(String x)
	{
		 String temp = revStr(x);
		
		if(x.equals(temp))
			return true;
		else
			return false;
	}

}
