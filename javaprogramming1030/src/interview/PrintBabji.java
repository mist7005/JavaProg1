package interview;

public class PrintBabji {

	public static void main(String[] args) {
		String s="BABJI";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c[j]);
			}
			System.out.println("");
		}

	}

}
