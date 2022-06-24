import java.io.*;
class Employee
{
	private String name;
	private int age;
	private float salary;
	
	public void read()
	{
		Console con = System.console();
		System.out.println("Enter yout name :");
		name = con.readLine();
		System.out.println("Enter your age :");
		age = Integer.parseInt(con.readLine());
		System.out.print("Enter Salary :");
		salary = Float.parseFloat(con.readLine());
	}
	public void show()
	{
		System.out.println("Name :"+name+"\nAge :"+age+"\nSalary :"+salary);
	}
}