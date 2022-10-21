package program;

import java.util.Scanner;

public class Program58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String st=sc.nextLine();
		char ch[] = st.toCharArray();
		boolean rs[] = new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
			{
			if(rs[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						rs[j]=true;
					}
				}
				System.out.println(ch[i]+"---->"+count);
			}
		}
		

	}

	}

}
