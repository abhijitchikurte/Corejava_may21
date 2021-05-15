package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		
		
		try 
		{
			int div=a/b;
			
		
		}catch(ArithmeticException e)
		
		{
			System.out.println("Arithmetic exception");
		}
		
		catch(Exception e)
		
		{
			System.out.println("Exception handled");
		}finally 
		{
			System.out.println("Try catch executed sucessfully");
		}
		
		System.out.println("Hello");
		
		int myarray[]= {1,2,50,100,150};
		try
		{
			System.out.println(myarray[6]);

		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array exception handled");
		}
		
	}

}
