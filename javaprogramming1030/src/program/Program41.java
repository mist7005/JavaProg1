package program;

public class Program41 {
	static int diffSmBg(int x[])
	{
		int bg=x[0];
		int sm=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>bg)
				bg=x[i];
		}
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<sm)
				sm=x[i];
		}
		return bg-sm;
	}

	public static void main(String[] args) {
		int a[]= {20,5,8,12,18,4};
		int result=diffSmBg(a);
		System.out.println("the difference between biggest and smallest is: "+result);

	}

}
