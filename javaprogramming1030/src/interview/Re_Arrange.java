package interview;

public class Re_Arrange {

	public static void main(String[] args) {
		String s="a1b2c3";
		String a="";
		String b="";
		Object x[]= new Object[s.length()];
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9')
			{
				a=a+ch[i];
				x[i]=ch[i];
			}
			else
			{
				b=b+ch[i];
				x[i]=ch[i];
			}
				
		}
		System.out.println(a+b);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}

}
