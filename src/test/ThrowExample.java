package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
					int a=16;
						
					if(a<18)
					{
				throw new Exception("not eligible for voting");
					}else
					{
					System.out.println("eligible for voting");
					}
			} catch (Exception e) {
				System.out.println("exception handled");
			}
		
		
	}

}
