package prac;

public class Person {
	String name;
	int age;
	int p=256;
	public Person()
	{
		
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setPerson()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	
}
