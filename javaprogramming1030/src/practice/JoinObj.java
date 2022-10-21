package practice;

public class JoinObj {
	String n1;
	JoinObj(String n1)
	{
		this.n1=n1;
	}
	

	public  String joinstr(Object o)
	{
		JoinObj d=(JoinObj)o;
		return this.n1+d.n1;
	}



	public static void main(String[] args) {
		JoinObj d1=new JoinObj("abhi");
		JoinObj d2=new JoinObj("shek");
		String res=d1.joinstr(d2);
		System.out.println("output: "+res);
	}

	

}
