package interview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class VowelConsonantCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		VowelConsCount(s);
		dupStr(s);

	}
	public static void VowelConsCount(String z)
	{
		int vC=0,cC=0;
		for (int i = 0; i < z.length(); i++) {
			char c=z.charAt(i);
			if(c>='A'&&c<='Z')
			{
				if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				{
					vC++;
				}
				else
					cC++;
			}
			else if(c>='a'&&c<='z')
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					vC++;
				}
				else
					cC++;
			}
		}
		System.out.println("vowel count "+vC);
		System.out.println("conso count "+cC);
		
		for (int i = 0; i < z.length(); i++) {
			char c=z.charAt(i);
			if(c>='a'&&c<='z')
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					System.out.println((int)c);
				}
			}
		}
	}
	
	public static void dupStr(String s)
	{
		String str[]=s.split("");
		HashMap<String, Integer> hs=new HashMap<>();
		for (String st : str) {
			if(hs.containsKey(st))
			{
				hs.put(st, hs.get(st)+1);
			}
			else
			{
				hs.put(st, 1);
			}
		}
		
		Set<String> ks = hs.keySet();
		for (String g : ks) {
			if(hs.get(g)>1)
			{
				System.out.println(g+"--"+hs.get(g));
			}
		}
	}
}
