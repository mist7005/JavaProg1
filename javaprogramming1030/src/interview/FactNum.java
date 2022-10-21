package interview;

public class FactNum {

	public static void main(String[] args) {
		int a=factNum(10);
		System.out.println(a);
	}
	public static int factNum(int x)
	{
		int prod = 1;
		for (int i = 1; i <= x; i++) {
			prod=prod*i;
		}
		return prod;

	}
}
