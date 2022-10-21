package program;

public class Pstring2 {

	public static void main(String[] args) {
		String s="hello world world";
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ')
				count++;
		}
		System.out.println("the word count is "+ count);
		

	}

}
