/*
ABSTRACT CLASS :>
	- An abstract class must be declared with an abstractt keyword.
	
	- Abstraction is a process of hiding the implementation details.
	 and showing onnly the functionality(function declarations) to the user.
	 
	- Can not make object of abstract class directly, but through derived class [can not be instructed
  
  	- Example of abstract method?
  	- Abstract class may contain abstract and non-abstract methods
  	- (0-100%) abstract methods can be there!
  	
  	- In case of Interface : 100% abstract method should be there!
  	
FINAL CLASS :>
	- The main purpose of using a class being declared as final is to prevent the class from being subclassed.
  		- If a class is marked as final then no class can inherit any feature from the final class.
  		- You cannot extend a final class. If you try it gives you a compile time error.
 */
package Unit_02;

public class P9_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda(43);
		obj.run();
		
		Super obj1 = new Super();
	}
}

class Student {
	Student(){
		System.out.println("WOW Java!");
	}
}

abstract class Bike extends Student{
	
	Bike(){
		System.out.println("Inside default constructor of Bike.");
	}
	Bike(int a){
		System.out.println("Inside Bike constructor : "+ a +"\n");
	}
	
	abstract void run(); //abstract method! (0-100%)
	
	void display() {
		System.out.println("This is a display method!");
	}
}

class Honda extends Bike{
	
	Honda(){
		System.out.println("Inside Honda default constructor.");
	}
	Honda(int a){
		super(3);
		System.out.println("Inside parrameterized constructor of Honda.");
	}
	void run() {
		System.out.println("Run() implemented in Honda");
		return;
	}
}

// FINAL CLASS
/*WE can extend another class in final class but not extends it to other classes*/

final class Super extends Student{
	public int data = 30;
	
	void display() {
		
		System.out.println(data);
		return;
	}
}

//class Sub extends Super{
// 	
// 	void display2(){
// 		display();
// 	}
//}