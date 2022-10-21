package interview;

public class AscendingOrder {

	public static void main(String[] args) {
		int a[]= {20,2,3,78,5};
		int x[]=ascNum(a);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public static int[] ascNum(int x[])
	{
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j])
				{
					int temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		return x;
		
	}

}
