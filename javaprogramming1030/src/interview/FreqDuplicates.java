package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FreqDuplicates {
	public static void printDup(String s)
	{
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(j<i && ch[i]==ch[j])
					break;
				else if(ch[i]==ch[j])
					count++;
			}
			if(count>0)
				System.out.println(ch[i]+" occurs "+count+" times");
		}
	}

	public static void raghuPrintDup(String str)
	{
		int count[]=new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			count[ch]++;
			//			System.out.println(ch+" "+count[ch]);

		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]>0)
			{
				System.out.println((char)i+"--->"+count[i]);
			}
			//			System.out.println(count[i]);
		}
	}

	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		String str=sc.nextLine();
		//		printDup(str);
		//		raghuPrintDup(str);
		//		char x='a';
		//		int z1=x;
		//	
		//		int x1=97;
		//		char z2=(char)x1;
		//		System.out.println(z1); 97
		//		System.out.println(z2); a 

//		String a="abh";
//		String b="ish";
//		String c="ek";
//		String z=a.concat(b).concat(c);
//		System.out.println(z);
		String s="ms dhoni is my fav dhoni dhoni dhoni";
		printDupSentence(s);

	}

	//using hashmap
	public static void dupMap(String str)
	{
		char[] chars=str.toCharArray();
		HashMap<Character, Integer> charMap=new HashMap<>();

		for (char ch:chars) {
			if(charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch)+1);
			else
				charMap.put(ch, 1);
		}
		//		Set ss = charMap.entrySet();
		//		System.out.println(ss);
		//		Iterator<Object> i=ss.iterator();
		//		while(i.hasNext())
		//		{
		//			System.out.println(i.next());
		//		}

		Set<Character> keys=charMap.keySet();
		for (Character ch : keys) {
			if(charMap.get(ch)>1)
			{
				System.out.println("character "+ch+" repeating "+charMap.get(ch)+" times");
			}
		}
		System.out.println(charMap.get(chars[1]));
	}
	
	
	
	public static void printDupWordUsingLinkedHS(String s)
	{
		char ch[]=s.toCharArray();
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		for (char c1 : ch) {
			hs.add(c1);
		}
		for (Character ch2 : hs) {
			int count=0;
			for (char ch3 : ch) {
				if(ch2.equals(ch3))
					count++;
			}
			System.out.println(ch2+" "+count);
		}
	}

	public static void printDupSentence(String s)
	{
		String str[]=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		for (String str1 : str) {
			hs.add(str1);
		}
		for (String str2 : hs) {
			int count=0;
			for (String str3 : str) {
				if(str3.equals(str2))
					count++;
			}
			System.out.println(str2+" "+count);
		}
	}






}
