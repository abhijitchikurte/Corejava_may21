package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA Empl= new ClassA(1100,"Abhijit","Test");
		ClassA Empl2=new ClassA();
		//Empl.name="ABHIJIT";
		//Empl.orgname="TEST";
		//Empl.salary=1000;
		
		Empl.display();
		
		ClassB obj1= new ClassB();
		obj1.name="Rupesh";
		obj1.salary=1000;
		obj1.orgname="PWA";
		
		obj1.display();
		obj1.show();
		
		Classc obj2=new Classc();
		obj2.run();		
        
	}

}
