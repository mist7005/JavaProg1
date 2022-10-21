package program;

import java.util.Scanner;
public class Program59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String st = sc.nextLine();
		String s=st.toLowerCase().replaceAll("\\s","");
		char ch[] = s.toCharArray();
		boolean rs[] = new boolean[ch.length];
		char c[]=new char[ch.length];
		int count=0;
		for(int i=0;i<c.length;i++)
			c[i]=(char)('a'+i);
		
		if(ch.length<26)
		{
			System.out.println("not a pangram");
			System.exit(0);
		}   
		else
		{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==c[j])
					rs[j]=true;
				count++;
			}
		}
	}
		
//	int count =0;
//	for(int i=0;i<rs.length;i++)
//	{
//		if(rs[i]!=true)
//			count++;
//	}
	if (count !=0) 
		System.out.println("pangram");
	else
		System.out.println("not pangram");


	for(int i =0;i<ch.length;i++)
	{
		System.out.print(i+"  "+ch[i]+" ");
		System.out.print(c[i]+" ");
		System.out.println(rs[i]+" ");
	}

	}	}
