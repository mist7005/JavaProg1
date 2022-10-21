package prac;

public class P1 {

	public static void main(String[] args) {
		Meth1 ob=new Meth1();
		int a=ob.countDigitNum(153);
		System.out.println("count is"+a);
//		int a=ob.reverseDigitNum(1234);
//		System.out.println("reverse is: "+a);
//		int a=ob.countPrimeInNum(491234);
//		System.out.println("count of prime is: "+a);
//		int a=ob.sumSquareOfDig(123);
//		System.out.println("sum of square of digit is: "+a);
//		int a=ob.sumCubeOfDig(123);
//		System.out.println("sum of cube of digit is: "+a);
		
		boolean b =ob.isArmstrong(-11);
		if(b==true)
		System.out.println("is armstrong number");
		else
			System.out.println("not armstrong number");
	}

}
