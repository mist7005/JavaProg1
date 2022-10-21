package prac;

public class Employee extends Person {
String empId;
float salary;
String companyName;

public Employee(String name,int age,String empId,float salary,String companyName)
{
	super(name, age);
	this.empId=empId;
	this.salary=salary;
	this.companyName=companyName;
}
public Employee(String empId,float salary,String companyName)
{
	this(null, 0, empId, salary, companyName);
}
public Employee(String empId,String companyName)
{
this(null, 0, empId, 0.0f, companyName);
}
public void printEmp()
{
	setPerson();
	System.out.println("empid is "+empId);
	System.out.println("salary is "+salary);
	System.out.println("company name is "+companyName);
}
public static void main(String[] args) {
	Employee e=new Employee("abhishek", 30, "emp123", 30000.45f, "qspiders");
	e.printEmp();
	System.out.println("------------------------------");
	Employee e1=new Employee("emp111", 20000.56f,"Oracle");
	e1.printEmp();
	
}
}
