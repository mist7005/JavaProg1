package prac;

public class ProgPrime {

	public static boolean isPrime(int x){
		for (int i = 2; i <= x/2; i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			boolean s=isPrime(i);
//			if(s)
//				System.out.println(i+" prime");
//			else
//				System.out.println(i+" not prime");
		
//		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i+"i");
			for (int j = 0; j < 3; j++) {
				if(i==j)
					break;
				System.out.println(j+"j");
			}
		}
	}
}


