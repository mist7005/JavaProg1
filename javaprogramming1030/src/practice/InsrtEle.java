package practice;

public class InsrtEle {
	
	static int[] insertEle(int a[],int in,int ele) {
		int c[]=new int[a.length+1];
		c[in]=ele;
		for (int i = 0; i < a.length; i++) {
			if(i<in)
				c[i]=a[i];
			else
				c[i+1]=a[i];
		}
		return c;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=2;
		int c=24;
		
		int x[]=insertEle(a,b,c);
		for (int i = 0; i < x.length; i++) {
		System.out.print(x[i]+" ");
		}

	}

}
