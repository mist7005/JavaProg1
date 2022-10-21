package prac;

public class Meth1 {
//	count the number of digits in a number
	 int countDigitNum(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;	
		}
		return count;
	}
//	 check the biggest and smallest digit in a number 
	 int[] checkBigSmallNum(int n)
		{
			int big=n%10;
			int small=n%10;
			while(n!=0)
			{
				int d=n%10;
				if(big<d)
					big=d;
				if(small>d)
					small=d;
					n=n/10;
			}
			int ar[]= {big,small};
			return ar;
		}
//	 reverse the digits in a number
	 
	 int reverseDigitNum(int n)
	 {
		 int a=0;
		 while(n!=0)
		 {
			int d=n%10; 
			a=a*10+d;
			n=n/10;
		 }
		 return a;
	 }
	 
//	 check prime number or not
	 boolean isPrime(int n)
	 {
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
				 return false;
		 }
		 return true;
	 }
	 
//	 count of prime number in a digit
	 int countPrimeInNum(int n)
	 {
		 int count=0;
		while(n!=0)
		{
			int d=n%10;
			boolean a=isPrime(d);
			if(a)
			count++;
			n=n/10;
	 }
		return count;
	 }
	 
//	 square of a number
	 int squareOfNum(int n)
	 {
		 return n*n;
	 }
	 
//	 cube of a number
	 int cubeOfNum(int n)
	 {
		 return n*n*n;
	 }
	 
//	 sum of square of a number
	 int sumSquareOfDig(int n)
	 {
		 int num=0;
		 while(n!=0)
		 {
			 int d=n%10;
			 num=num+squareOfNum(d);
			 n=n/10;
		 }
		 return num;
	 }
//	 sum of cube of digits of a number
	 int sumCubeOfDig(int n)
	 {
		 int num=0;
		 while(n!=0)
		 {
			 int d=n%10;
			 num=num+cubeOfNum(d);
			 n=n/10;
		 }
		 return num;
	 }
	 
//	 power of a number
	 
	 int pow(int n,int x )
	 {
		 int prod=1;
		 while(x>0)
		 {
			 prod=prod*n;
			 x--;
		 }
		 return prod;
	 }
	 
//	 check if happy number or not
	 boolean isArmstrong(int n)
	 {
		 int num=n;
		 int sum=0;
		 int c=countDigitNum(n);
		 while(n!=0)
		 {
			 int d=n%10;
			 sum=sum+pow(d, c);
			 n=n/10;
		 }
		 if(sum==num)
			 return true;
		 else
			 return false;
	 }

}
