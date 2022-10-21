package practice;

public class ArrMethods {

	public static void main(String[] args) {
		//		int a[]= {12,3,4,5,6,7,6};
		//		int x=diffFirstAndLast(a);
		//		System.out.println("the difference is: "+x);
		//		int a[]= {1,2,3};
		//		int x=prodOfArrayEle(a);
		//		System.out.println("the product is: "+x);
		//		int a[]= {44,1,2,3,99};
		//		int x=checkBig(a);
		//		System.out.println("biggest is: "+x);
		//		int a[]= {1,3,5,7,8};
		//		int x[]=countEvenOdd(a);
		//		System.out.println("even is: "+x[0]);
		//		System.out.println("odd is: "+x[1]);
		//		int a[]= {1,2,3};
		//		float x=averageOfarrEle(a);
		//		System.out.println("the average is: "+x);
		//		int a[]= {60,1,2,3,30};
		//		int x=diffBigSmall(a);
		//		System.out.println("the difference is: "+x);
		//		int a[]= {1,2,3,4};
		//		int b[]= {5,6,7,8,9};
		//		int x[]=mergeArray(a,b);
		//		for (int i = 0; i < x.length; i++) {
		//			System.out.println("the difference is: "+x[i]);
		//		}
		//		int a[]= {-60,-1,-2,3,-30};
		//		int x[]=countPoNe(a);
		//		System.out.println("count of positive is: "+x[0]);
		//		System.out.println("count of positive is: "+x[1]);
		//		int a[]= {1,3,5,2,4,6};
		//		int x[]=sumEvenOddArr(a);
		//		System.out.println("sum of even is: "+x[0]);
		//		System.out.println("sum of odd is: "+x[1]);
		//		int a[]= {1,2,3,4,12,7};
		//		int x=countPrime(a);
		//		System.out.println("the count of prime is: "+x);
		//		int a[]= {1,6,7,8};
		//		int b[]= {2,3,4,5};
		//		int x[]=insertArr(a,b,1);
		//		for (int i = 0; i < x.length; i++) {
		//			System.out.println(x[i]);
		//		}
		//		int a[]= {3,3,4,102,105,106};
		//		int b[]= {1,5,6,101,103};
		//		freqOFArrEle(a);
		//		for (int i = 0; i < x.length; i++) {
		//			System.out.println(x[i]);
		//		}
//		int a[]= {3,3,4,3,1,4};
//		freqOFArrEle(a);
		int b[]= {100,11,22,33,22,44,55};
		freq(b);
//		System.out.println(x);
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//		}
		

	}
	public static int[] sortAsc(int x[]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		return x;
	}
	public static int[] sortDesc(int x[]) {
		for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]<x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		return x;
	}
	public static void freqOFArrEle(int x[]) {
		boolean c[]=new boolean[x.length];
		for (int i = 0; i < x.length; i++) {
			if(c[i]==false)
			{
				int count=1;
				for (int j = i+1; j < x.length; j++) {
					if(x[i]==x[j])
					{
						count++;
						c[j]=true;
					}
				}
				System.out.println(x[i]+"----"+count);
			}

		}

	}
	public static void freq(int x[]) {
		boolean c[]=new boolean[x.length];
		int i=0;
		while(i<x.length) {
			if(c[i]==false)
			{
				int count=1;
				for (int j = i+1; j < x.length; j++) {
					if(x[i]==x[j])
					{
						count++;
						c[j]=true;
					}
				}
				System.out.println(x[i]+"----"+count);
			}
			i++;
		}

	}
	public static int sumOfDigit(int x)
	{
		int sum=0;
		while(x!=0){
			int d=x%10;
			sum=sum+d;
			x=x/10;
		}
		return sum;
	}
	public static int[] sumOfArrEle(int x[])
	{
		for (int i = 0; i < x.length; i++) {
			x[i]=sumOfDigit(x[i]);
		}
		return x;
	}
	
	public static int secondBig(int x[])
	{ 
		int z[]=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				int temp=0;
				if(x[i]<x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		int sec=x[1];
		return sec;
	}


		public static int[] sSArr(int x[],int y[])
		{
			int ar[]=new int[x.length+y.length];
			int i=0;
			int k=0;
			int j=0;
			while(j<x.length&&k<y.length)
			{
				if(x[j]<y[k])
					ar[i++]=x[j++];
				else
					ar[i++]=y[k++];
			}
			while(k<y.length)
			{
				ar[i++]=y[k++];
			}
			while(j<x.length)
			{
				ar[i++]=x[j++];
			}
			return ar;


		}


		public static int diffFirstAndLast(int a[]) {
			return a[0]-a[a.length-1];	
		}

		public static int prodOfArrayEle(int a[])
		{
			int prod=1;
			for (int i = 0; i < a.length; i++) {
				prod=prod*a[i];
			}
			return prod;
		}
		public static int checkBig(int a[])
		{
			int big=a[0];
			for (int i = 0; i < a.length; i++) {
				if(a[i]>big)
					big=a[i];
			}
			return big;
		}
		public static int[] countEvenOdd(int a[])
		{
			int ce=0;
			int co=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2==0)
					ce++;
				else
					co++;
			}
			int re[]= {ce,co};
			return re;
		}
		public static float averageOfarrEle(int a[])
		{
			int sum=0;
			for (int i = 0; i < a.length; i++) {
				sum=sum+a[i];
			}
			return sum/a.length;
		}
		public static int diffBigSmall(int a[])
		{
			int big=a[0];
			int small=a[1];
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]>big)
					big=a[i];
				else if(a[i]<small)
					small=a[i];
			}
			return big-small;
		}
		public static int[] mergeArray(int x[],int y[])
		{
			int ar[]=new int[x.length+y.length];
			for (int i = 0; i < x.length; i++) {
				ar[i]=x[i];
			}
			for (int i = 0; i < y.length; i++) {
				ar[x.length+i]=y[i];
			}
			return ar;
		}
		public static int[] countPoNe(int x[])
		{
			int po=0;
			int ne=0;
			for (int i = 0; i < x.length; i++) {
				if(x[i]>0)
					po++;
				else
					ne++;
			}
			int re[]= {po,ne};
			return re;
		}
		public static boolean isEvenOdd(int x)
		{
			if(x%2==0)
				return true;
			return false;
		}
		public static int[] sumEvenOddArr(int x[])
		{
			int se=0;
			int so=0;
			for (int i = 0; i < x.length; i++) {
				if(isEvenOdd(x[i]))
					se=se+x[i];
				else
					so=so+x[i];
			}
			int re[]= {se,so};
			return re;
		}
		public static boolean isPrime(int x)
		{
			for (int i = 2; i <= x/2; i++) {
				if(x%i==0)
					return false;
			}
			return true;
		}
		public static int countPrime(int x[])
		{
			int prCount=0;
			for (int i = 0; i < x.length; i++) {
				if(isPrime(x[i]))
					prCount++;
			}
			return prCount;
		}
		public static int[] insertArr(int x[],int y[],int in)
		{
			int ar[]=new int[x.length+y.length];
			for (int i = 0; i < y.length; i++) {
				ar[i+in]=y[i];
			}
			for (int i = 0; i < x.length; i++) {
				if(i<in)
					ar[i]=x[i];
				else
					ar[i+y.length]=x[i];
			}
			return ar;
		}
		public static int[] zigZag(int x[],int y[])
		{
			int ar[]=new int[x.length+y.length];
			int i=0;
			int j=0;
			while(j<x.length&&j<y.length)
			{
				ar[i++]=x[j];
				ar[i++]=y[j++];
			}
			while(j<x.length)
			{
				ar[i++]=x[j++];
			}
			while(j<y.length)
			{
				ar[i++]=y[j++];
			}
			return ar;
		}

		public static int[] sortSortedArr(int x[],int y[])
		{
			int ar[]=new int[x.length+y.length];
			int i=0;
			int j=0;
			int k=0;
			while(i<x.length && j<y.length)
			{
				if(x[i]<y[j])
					ar[k++]=x[i++];
				else
					ar[k++]=y[j++];		
			}
			while(i<x.length)
				ar[k++]=x[i++];
			while(j<y.length)
				ar[k++]=y[j++];
			return ar;
		}
	}

