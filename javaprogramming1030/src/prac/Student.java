package prac;

public class Student extends Person {
	String college;
	String branch;
	int id;	
	String p="student";
	public Student(String name, int age, String college, String branch, int id) {
		super(name, age);
		this.college = college;
		this.branch = branch;
		this.id = id;
	}
	public Student()
	{	
	}
	public static  void show()
	{
		char p='S';
		System.out.println(p);
		Student s=new Student();
		System.out.println(s.p);
		Person p1=new Person();
		System.out.println(p1.p);		
	}
	public static void main(String[] args) {
		show();
	}
}
