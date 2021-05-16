package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> mylist=new ArrayList <String>();
		
		mylist.add("pooja");
		mylist.add("eshaani");
		mylist.add("suman");
		mylist.add("abhijit");
		
		System.out.println("Before sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		System.out.println("after sorting");
		System.out.println(mylist);
		
		Collections.reverse(mylist);
		System.out.println("after reverse");
		System.out.println(mylist);
		
		Stack <String> mystack= new Stack<String>();
		
		mystack.push("abc");
		mystack.push("pqr");
		mystack.pop();
		System.out.println(mystack);
		mystack.push("xyz");
		System.out.println(mystack);
		

		
		
		

	}

}
