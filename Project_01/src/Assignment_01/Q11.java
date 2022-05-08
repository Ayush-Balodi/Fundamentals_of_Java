/*
 *	As given there are two sample methods: First one returns the sum of 
 *	two numbers a and b and second one returns the subtraction of a and b. if 
 *	a-b is negative then return value would be 0. Use ternary operator to call 
 *	these two methods. If a>b then ternary should call sum(a,b) but if a<b 	
 *	then ternary operator should call sub(a,b). Eventually print the result of 
 *	the ternary operation on variable a and b.
 *	Note: Ternary operator can call a method even for true and false values 
 */
package Assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main( String[] args ) {
		
		Scanner obj = new Scanner( System.in );
		
		System.out.print("Enter the first number         : ");
		int a = obj.nextInt();
		
		System.out.print("Enter the second number        : ");
		int b = obj.nextInt();
		
		test1 obj1 = new test1( a , b );
		
		int result = ( a > b ) ? obj1.first() : obj1.second();
		
		System.out.println("The result of the operation is : "+result);
		obj.close();
	}
}

class test1{
	int a , b;
	
	test1(){
		
	}
	
	test1( int a , int b ){
		this.a = a;
		this.b = b;
	}
	
	int first() {
		return ( a + b );
	}
	
	int second() {
		return ( ( a - b ) < 0 ) ? 0 : ( a - b );
	}
}