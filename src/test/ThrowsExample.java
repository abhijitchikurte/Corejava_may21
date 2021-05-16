package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample obj=new ThrowsExample();
		try {
	    obj.eligibility(17);
		}catch (ArithmeticException e )
		{
			System.out.println("Exception is handled");
		}

	}
	
	public void eligibility(int age)
	{
	if (age<18)
	{
		throw new ArithmeticException ("not valide age");
		
	}else
	{
	System.out.println("eligible for voting");	
	}
	}

}
