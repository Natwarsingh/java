package a.b.c;
public class Person
{
	public String name;
	public String surname;
	
	public Person()
	{
		name="unknown";
		surname="unknown";
	}
	public Person(String nm,String snm)
	{
		name=nm;
		surname=snm;
	}
	public Person(Person ps)
	{
		name=ps.name;
		surname=ps.surname;
	}
}