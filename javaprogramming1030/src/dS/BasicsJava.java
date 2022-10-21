package dS;


public class BasicsJava {

	public  void goodBoy(int x,String y) {
		System.out.println("basic 1");
	}
	public static void goodBoy(String x,
			int y)
	{
		System.out.println("string");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int n=2;
		while(n>0)
		{
			
		for (int i = 1; i <= 10; i++) {
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		n--;
		}
		BasicsJava bj=new BasicsJava();
//		System.out.println(bj.goodBoy(20));
		goodBoy("hello abhi",1);
	}
	}


