package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class IntMethods {

	public static int numCount(int x)
	{
		int count=0;
		while(x!=0)
		{
			count++;
			x=x/10;
		}
		return count;
	}
	public static int revNum(int x)
	{
		int num=0;
		while(x!=0)
		{
			int d=x%10;
			num=num*10+d;
			x=x/10;
		}
		return num;
	}
	public static boolean isPalindrome(int x)
	{
		int rev=revNum(x);
		return x==rev;
	}

	public static int bigDigit(int x)
	{
		int big=0;
		while(x!=0)
		{
			int d=x%10;
			if(d>big)
				big=d;
			x=x/10;
		}
		return big;
	}

	public static boolean isSpecial2DigitNo(int x)
	{
		int rem=x;
		int sum=0;
		int prod=1;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d;
			prod=prod*d;
			x=x/10;
		}
		int rslt=sum+prod;
		return rslt==rem;
	}

	public static boolean isPrime(int x)
	{
		for (int i = 2; i <= x/2; i++) {
			if(x%i==0)
				return false;
		}
		return true;

	}
	public static void primeWithin100()
	{	
		System.out.println("the prime nos are: ");
		for (int i = 1; i < 100; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}

	public static void primeBetween(int start,int end)
	{
		if(start<=0||end<=0)
			System.out.println("the start or end should be greater than 0");
		else if(start>end)
		{
			System.out.println("start should be less than end");
		}
		else if(start==end)
		{
			System.out.println("start and cannot be equal");
		}
		else
		{
			System.out.println("the prime nos are: ");
			for (int i = start; i <= end; i++) {
				if(isPrime(i))
					System.out.println(i);
			}
		}
		System.out.println("end");
	}
	
	
	public static void primeUsingArr(int start,int end)
	{
		if(start<=0||end<=0)
			System.out.println("the start or end should be greater than 0");
		else if(start>end)
		{
			System.out.println("start should be less than end");
		}
		else if(start==end)
		{
			System.out.println("start and cannot be equal");
		}
		else
		{
			boolean b[]=new boolean[end+1];
			int arr[]=new int[end+1];
			for (int i = start; i <= end; i++) {
				if(isPrime(i))
					arr[i]=i;
				else
					arr[i]=0;
			}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				b[i]=false;
			else
				b[i]=true;
		}
		int all=0;
		for (int i = 0; i < arr.length; i++) {
			if(b[i]==true)
				all++;
		}
		System.out.println("prime nos are: ");
		if(all==0) {
			System.out.println("no prime no");
		}
		else {
			for(int i=0;i<arr.length;i++)
			{		
				if(arr[i]!=0)
					System.out.println(arr[i]);	
			}
		}
		}
	}
	
	public static int[] divArr(int x)
	{
		int count=0;
		for (int i = 1; i < x; i++) {
			if(x%i==0)
				count++;
		}
		int j=0;
		int arr[]=new int[count];
		for (int i = 1; i < x; i++) {
			if(x%i==0)
			{
				arr[j]=i;
				j++;
			}
		}
		return arr;
	}
	
	public static boolean isHapp(int x)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		while(x!=1)
		{
			int curr=x;
			int sum=0;
			while(curr!=0)
			{
				sum=sum+(curr%10)*(curr%10);
				curr=curr/10;
			}
			if(hs.contains(sum))
			{
				return false;
			}
			hs.add(sum);
			x=sum;
		}
		return true;
		
	}
	
	public static ArrayList<Integer> divList(int x)
	{	
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 1; i < x; i++) {
			if(x%i==0)
				al.add(i);
		}
		
		return al;
	}
	public static boolean isPerfect(int x)
	{	
		int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer>(divList(x));
		for(Integer i:al)
		{
			sum=sum+i;
		}
		return sum==x;
	}
	
	
	
	public static boolean isPerfectSim(int x)
	{
		int sum=0;
		for (int i = 1; i < x; i++) {
			if(x%i==0)
				sum=sum+i;
		}
		return sum==x;
	}
	
	public static int factNum(int x)
	{
		int fact=1;
		for (int i = 2; i <= x; i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static boolean isStrong(int x)
	{
		int rem=x;
		int sum=0;
		while (x!=0) {
			int d=x%10;
			sum=sum+factNum(d);
			x=x/10;
		}
		return sum==rem;
	}
	public static boolean isHappy(int n)
	{
		HashSet<Integer> seen=new HashSet<Integer>();
		while(n!=1)
		{
			int current=n;
			int sum=0;
			while(current!=0)
			{
				sum=sum+(current%10)*(current%10);
				current= current/10;
			}
			if(seen.contains(sum)) 
			{
				return false;
			}
			seen.add(sum);
			n=sum;
		}
		return true;
		
	}
	public static int powNum(int num,int pow)
	{
		int cu=1;
		while(pow>=1)
		{
			cu=cu*num;
			pow--;
		}
		return cu;
	}
	public static boolean isArmstrong(int x)
	{
		int temp=x;
		int count=numCount(x);
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+powNum(d, count);
			x=x/10;
		}
		return sum==temp;
	}
	
	public static boolean isDisarium(int x)
	{	
		int po=numCount(x);
		int temp=x;
		int sum=0;
		
		while(x!=0)
		{
			int d=x%10;
			sum=sum+powNum(d, po);
			po--;
			x=x/10;
		}
		return sum==temp;
		
	}
	
	public static void main(String[] args) {
//		ArrayList<Integer> x=new ArrayList<Integer>(divSrs(6));
//		for (int i = 0; i < x.size(); i++) {
//			System.out.println(x.get(i));
//		}
//		boolean x=isPerfectSim(28);
//		System.out.println(x);
//		int z[]=divArr(6);
//		for (int i = 0; i < z.length; i++) {
//			System.out.println(z[i]);
//		}
//		System.out.println(isStrong(145));
//		System.out.println(isHapp(15));
//		System.out.println(isArmstrong(407));
//		int num=89;
//		int po=numCount(89);
//		int a=powNum(9, po);
//		po--;
//		int b=powNum(8, po);
//		int re=a+b;
//		if(re==num)
//		
//		System.out.println(numCount(89));
//		System.out.println(isDisarium(135));
		primeUsingArr(14,16);
	}

}
