package prac;

public class RunEncp {

	public static void main(String[] args) {
		DemoEncp d=new DemoEncp();
		d.name="abhishek";
		d.setPin(1234);
		d.setBalance(2300.0f);
		System.out.println(d.name);
		System.out.println(d.getPin());
		System.out.println(d.getBalance());
	}

}
