package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MainRunner {
	//2 4 8 20 1 5 7 11
	public static void main(String[] args) {
		String s="a1b2c3";
		char a[]=new char[3];
		char b[]=new char[3];
		int counter=0;
		int counter1=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				a[counter]=ch;
				counter++;
			}
			else
			{
				b[counter1]=ch;
				counter1++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+",");
		}

		try
		{
//			System.out.println(12/0);
		}
		finally {
			System.out.println("enter finally");
			
			System.out.println("exit finally");
		}
		System.out.println("end");
		Object a1[]= {1,2,"abhi",'c'};
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}
}



