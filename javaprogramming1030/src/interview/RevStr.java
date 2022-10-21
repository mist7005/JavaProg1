package interview;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		String x=revStr("abhishek is a good boy");
		System.out.println(x);

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


}
