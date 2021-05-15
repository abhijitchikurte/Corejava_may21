package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ClassA Empl= new ClassA(1100,"Abhijit","Test");
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
		obj2.run();		*/
		
        MethodOverloading obj3=new MethodOverloading();
        obj3.multi(3, 5);
        obj3.multi(3, 5.5);
        
        MethodOverrideChild obj4=new MethodOverrideChild();
        obj4.display();
        
        AbstractChild obj5=new AbstractChild();
        obj5.method2();
        
        InterfaceChild obj6=new InterfaceChild();
        obj6.method1();
        
        EncapsulationExample obj7=new EncapsulationExample();
       obj7.setSalary(1000);
       System.out.println(obj7.getSalary());
	}

}
