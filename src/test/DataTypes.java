package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		//------ data types in java-----
		
		int num1; 
		int num2;
		num1=50;
		num2=11;
		
		int sum= num1+num2;
		int mul= num1*num2;
		float div= (float) num1/num2;
		
		System.out.println("addition: " +sum);
		System.out.println("multiplication: " +mul);
        System.out.println("division: " +div);
		
		
	    Scanner scanner= new Scanner (System.in);
	  
		/*System.out.println("enter the name of user:");
		String name=scanner.nextLine();

		System.out.println("lenght:" +name.length());*/
	    
	    //-----------arrays---
	    
	    int myarray[]= {1,2,100,9,10};
	    String sarray[]= {"abhi", "rupesh","kishor"};
	    System.out.println("Third value in the array:"+myarray[2]);
	    
	    System.out.println("Third value in the array:"+sarray[2]);

		

	}

}
