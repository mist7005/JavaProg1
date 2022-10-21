package program;
import java.util.Scanner;

public class PString1 {

	public static void main(String[] args) {
		//hello world
		Scanner sc = new Scanner(System.in);
		String s="hello my little angel";
		s=" "+s;
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' '||c[i]-1==' ')
				count++;
		}
		System.out.println("the word count is "+ count);
		
		

	}

}
