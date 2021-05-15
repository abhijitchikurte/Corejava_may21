package oopsConcepts;

public class MethodOverloading {
	
	public void multi(int a, int b)
	
	{
		int multi=a*b;
		System.out.println("int multiplication :" +multi);
	}
	
	public void multi (double a, double b)
	{
	 double multi=a*b;
	 System.out.println("double multiplication:" +multi);
	}

}
