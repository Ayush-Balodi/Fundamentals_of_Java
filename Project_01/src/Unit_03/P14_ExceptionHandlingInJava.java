/*
 * use of throws keword
 * use of finally
 * 
 * FILE HANDLING :->
 * 	- Reading input from a file instead of console.
 * 	- Save the output into the file.
 * 	- Create a log file of execution pattern.
 * 
 * finally always runs => exception not catch( not appropriate ) , application terminates but finally then also executes.
*/
package Unit_03;

import java.util.Scanner;

public class P14_ExceptionHandlingInJava{
	public static void main (String args[]) {
		
		ABCDE obj = new ABCDE();
//		obj.basicException();
//		obj.handleException();
//		obj.multipleCatch();
//   	obj.inputMismatchException();
//		obj.stackOverFlowError(12);
//		obj.indexOutOfBoundException();
//		obj.useOfThrows2();
		obj.checkedAndUncheckedException();
	}
}

class ABCDE{
	
	void basicException() {
		
		int a = 0;
		int b = 100 / a;
		
		System.out.println(b);		
		return;
	}
	
	void handleException() {
		
		try {
			int b=0;
			int a = 100 / b;
		}
		catch( ArithmeticException e ){
			System.out.println(e.getMessage());
		}
		return;
	}
	
	void multipleCatch() {
		
		try {
			int b=0;
			int a = 100 / b;
		}
		catch( ArithmeticException e ){
			System.out.println(e.getMessage());
		}
		return;
	}
	
	void inputMismatchException() {
		
		Scanner obj = new Scanner(System.in);
		int num;
		num = obj.nextChar();
		
		System.out.println(num);
		obj.close();
		return;
	}
	
	void stackOverFlowError( int n ) {
		
		System.out.println(n);
		stackOverFlowError(--n);
		return;
	}
	
	void indexOutOfBoundException() {
		
		int[] arr = new int[4];
		
		for( int i=0 ; i<4 ; i++ ) {
			arr[i] = i;
		}
		
		System.out.println(arr[5]);
		return;
	}
	
	void nullPointerException() {
		
		String str = "null";
		
		System.out.println(str.length());
		return;
	}
	
	void manually_throw(int age)
	{
		//throw keyword
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("access denied");
			}
			else
			{
				System.out.println("access granted");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void useOfThrows(int age) throws Exception
	{
		//throws keyword= we can use either throws or try catch
		if(age<18)
			throw new Exception();
		else
			System.out.println("allowed");
//				rest code
		System.out.println("done");

	}
	
	void useOfThrows2()
	{
		try {
			useOfThrows(18);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void checkedAndUncheckedException() {
		//unchecked exception or runtime exception
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);
		
		//checked or compile time exception 
		try {
			useOfThrows(30);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void check_index(int i) throws ManualException{
		if(i<0 || i>5)
			throw new ManualException();
	
		System.out.println("valid index");
	}
	void manualExceptionThrow() {
		
		try {
			int arr[]= {1,2,3,4,5};
			check_index(6);
		} catch (ManualException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class ManualException extends Exception{
	public String getMessage()
	{
		return "manual exception index out of bound";
	}
}

//P14_ExceptionHanding.java:
//1- obj.basicException() {/ by zero}
//2- obj.handleException() {use of try and catch}
//3- obj.multipleCatch() {multiple catch for one try block}
//4- obj.inputMismatchException() {nextInt() and enter string}
//5- obj.stackOverFlowError() {unstoppable recursion}
//6- obj.indexOutOfBoundException() {a[10] in a[3] array}
//7- obj.nullPointerException() {s.lenght() when s is null}
//8- obj.useOfThrow() {manually throw exception}
//9- obj.useOfThrows&Finally() {declare what possible exceptions may occur, finally always run}
//10-obj.checkedAndUncheckedException(){compile and run time exception}
//11-obj.manualExceptionThrow(){*optional, make your own exception and throw it}