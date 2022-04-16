/*
 => extends keyword 
 * 
 => sub class
 => super class
 => code "reusability"
 
   class derived-class-name "extends" base-class
   {
   		//methods and fields
   }
   
   Types of Inheritance :-
   
   => Single Inheritance
   
   => Multilevel Inheritance
   
   => "Multiple Inheritance : " Java does not support multiple inheritance to avoid conflict
     of one subclass inheriting two super class.
     	-> It handles this feature by implementing more than one interface instead of extending
     	   more than on class.
   
   => Hierchial Inheritance : Like a tree
   
   => Hybrid Inheritance : No, as without multiple inheritance it looks like hierchial inheritance.
   
   => CONSTRUCTOR calls flow in inheritance :-
   		- Default constructor
   		- Parameterized constructor
 */
package Unit_02;

public class P8_Task01_InheritanceInJava {

	public static void main(String[] args) {
		Three obj = new Three(23);
		obj.methodOne();
		obj.methodtwo();
		obj.methodthree();
	}
}

class One{
	
	int a=23;
	
	One(){
		System.out.println("Inside default constructor of class one.");
	}
	
	One( int a ){
		System.out.println("Inside parameterized constructor of class one.");
	}
	
	public void methodOne() {
		System.out.println("First Method");
		return;
	}
}

class Two extends One{
	
	int b;
	
	Two(){
		System.out.println("Inside default constructor of class two.");
	}
	
	Two( int b ){
		//super(5);
		System.out.println("Inside parameterized constructor of class two.");
		System.out.println("b = "+b);
	}
	
	public void methodtwo() {
		
		System.out.println("Second method");
		return;
	}
}

class Three extends Two{
	
	int b;
	
	Three(){
		super(7);
		System.out.println("Inside default constructor of class three.");
	}
	
	Three( int b ){
		super(3);
		System.out.println("Inside parameterized constructor of class three.");
	}
	
	public void methodthree() {
		System.out.println("Third method");
		return;
	}
}