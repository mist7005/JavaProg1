package dS;

public class Basic2 extends BasicsJava {

	public String main(String z) {
		System.out.println("Basic2");
		return z;
	}
	public static void goodBoy(String x,int y)
	{
		
	}
	public int main(int x)
	{
		System.out.println("bye");
		return x;
	}
	public static void main(String[] args) {
		Basic2 b=new Basic2();
		String a = b.main("hello");
		System.out.println(a);
	}
}
