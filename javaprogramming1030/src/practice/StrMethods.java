package practice;


public class StrMethods {

	public static void main(String[] args) {
		//in the given String print the ascii value of the characters
		//extract only numeric values and add 100
		String s="Aab12x34YzZ";
		int num1=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch+"-----"+(int)ch);
			if(ch>='0'&&ch<='9')
			{	
				int y=ch;
				num1=num1 * 10+ y-48;
			}
		}
		System.out.println(num1+100);

		//or using split method and parseInt
		String a[]= {"0","1","2","3","4","5","6","7","8","9"};
		String str[]=s.split("");
		String num="";
		for (int i = 0; i < str.length; i++) {
			for (String st : a) {
				if(st.equals(str[i]))
				{
					System.out.println(str[i]);
					num=num+str[i];
				}
			}
		}
		int n=Integer.parseInt(num);
		System.out.println(n+100);


	}	
}


