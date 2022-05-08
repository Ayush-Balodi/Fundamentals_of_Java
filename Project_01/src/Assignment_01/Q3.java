/*
 *  Given an interface in1 which includes a method display which takes an integer as input .
 *  interface In1
 *	{
 * 		void display(int p);
 *	}	
 *
 *	Task is to write a class testClass which implements interface In1 and has 
 *	a method named display which takes an integer as an input p and the 	
 *	display method should be able to tell if the number is prime or not?
 *	- The main method should not be in testClass, create a separate class for 
 *	that.
 */
package Assignment_01;

public class Q3 {

	public static void main(String[] args) {
		
		testClass obj = new testClass();
		obj.display(55);
	}
}

interface In1{
	
	void display(int p);
}

class testClass implements In1{

	public void display( int p ) {
		
		int c = 0;
		for( int i=2 ; i<=Math.sqrt(p) ; i++ ) {
			if( p%i == 0 ) {
				c++;
				break;
			}
		}
		if( c == 0 ) {
			System.out.println(p+" is a prime number.");
		}
		else {
			System.out.println(p+" is not a prime number.");
		}
		return;
	}	
}