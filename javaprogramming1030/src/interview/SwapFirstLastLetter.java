package interview;

public class SwapFirstLastLetter {

	public static String swap(String x)
	{
		char c[]=x.toCharArray();
		char temp=c[0];
		c[0]=c[c.length-1];
		c[c.length-1]=temp;
		x=new String(c);	
		return x;
	}
	public static void main(String[] args) {
		String s = swapFirstLastLetter("abhishek is a good boy");
		System.out.println(s);
	}
	public static String swapFirstLastLetter(String x)
	{
		String s[]=x.split(" ");
		String op="";
		for (int i = 0; i < s.length; i++) {
			{
				op=op+" "+swap(s[i]);
			}	
		}
		return op;
		
	}
	public static String swapFirstLastWord(String s)
	{
		String ar[]=s.split(" ");
		String temp=ar[0];
		ar[0]=ar[ar.length-1];
		ar[ar.length-1]=temp;
		String rev="";
		for (int i = 0; i < ar.length; i++) {
			rev+=ar[i]+" ";
			
		}
		return rev;
			
		}
	}


