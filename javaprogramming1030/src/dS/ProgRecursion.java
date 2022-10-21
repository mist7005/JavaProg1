package dS;

public class ProgRecursion {

	public static void main(String[] args) {
		//		int a[]= {20,13,25,67,87};
		//		System.out.println(search(a, 25));
		System.out.println(revStr("hello"));

	}
	//print n to 1 using recursion
	public static void printXto1(int x)
	{
		System.out.println(x);
		if(x>1)
			printXto1(x-1);
	}

	//print 1 to n using recursion
	public static void print1toX(int x) {
		if(x>1)
			print1toX(x-1);
		System.out.println(x);

	}

	//sum of first n natural number 
	public static int sumOfNat(int n)
	{
		if(n==0)
			return 0;
		return n+sumOfNat(n-1);
	}

	//factorial of a number
	public static int fact(int n)
	{
		if(n==1||n==0)
			return 1;
		return n*fact(n-1);
	}

	//method to search the element from array using recursion(linear search)
	public static int search(int ar[],int ele)
	{
		return search(ar, ele, 0);
	}
	public static int search(int[] ar, int ele, int i) {
		if(i==ar.length)
			return -1;
		if(ar[i]==ele)
			return i;
		return search(ar, ele, i+1);
	}

	//method to print fibonacci series


	//reverse a string using recursion
	public static String revStr(String str)
	{
		if(str==null||str.isEmpty())
			return str;
		String rev="";
		for (int i = str.length()-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
}


