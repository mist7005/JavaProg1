package practice;

import java.util.Scanner;

public class ReverseOfString {
	String a;
	int lengt;
	ReverseOfString(String a)
	{
		this.a=a;
		lengt=a.length();
		
	}
//	@Override
//	public String toString() {
//		return  a;
//	}
	private  String revOfStr() {

		char ch[]=this.a.toCharArray();
		char x[]=new char[ch.length];
		int n=ch.length;
		for(int i=0;i<ch.length;i++)
		{
			x[i]=ch[ch.length-1-i];
		}
		a=new String(x);
		return a;
	}
	private String pangram() {
		char ch[]=this.a.toCharArray();
		char x[]=new char[ch.length];
		int n=ch.length;
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			x[i]=ch[ch.length-1-i];
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==(x[i]))
			{
				b[i]= true;
			}
			else
				b[i]=false;
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==false)
				return "not same";
		}
		return "same";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to reverse");
		ReverseOfString x=new ReverseOfString(sc.nextLine());
		System.out.println("the reverse is: "+x.revOfStr());
		System.out.println("pangram: "+x.pangram());
		System.out.println("the length of string is: "+x.lengt);
	}


}
