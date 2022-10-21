package practice;

public class ZigZag {

	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={22,33,44,55};
		int x[]=zigzag(a,b);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	private static int[] zigzag(int x[],int y[]) {
		int ar[]=new int[x.length+y.length];
		int j=0;
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i<x.length && i<y.length)
			{
				ar[k]=x[i];
				k++;
				ar[k]=y[j];
				k++;
				j++;
			}
			else if(i<x.length)
			{
				ar[k]=x[i];
				k++;
			}
			else if(i<y.length)
			{
				ar[k]=y[j];
				j++;
			}
		}
		return ar;
	}

}
