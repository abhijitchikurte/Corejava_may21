package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	    
	    System.out.println("Enter any number");
	    int number = input.nextInt();
	    
	    if (number%number==0||number%1==0)
	    {
	        System.out.println("Number is prime");
	        
	    }
	        else
	        {
	            System.out.println("Number is not prime");
	        }
	}

}
