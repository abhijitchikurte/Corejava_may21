package oopsConcepts;

public class ClassA {

	public int salary;
	
	public String name;
	public String orgname;
	
	public ClassA()
	{
		
		System.out.println("inside the constructor");
     }
	public ClassA(int val1, String val2, String val3)
	{
		
		System.out.println("Parameterize the constructor");
		this.salary=val1;
		this.name=val2;
		this.orgname=val3;
		
     }
	
	
	
	
	public void display()
	
	{
		System.out.println("name of emp:" +name);
		System.out.println("name of orgname:" +orgname);
		System.out.println("name of salary:" +salary);

		
	}

	}


