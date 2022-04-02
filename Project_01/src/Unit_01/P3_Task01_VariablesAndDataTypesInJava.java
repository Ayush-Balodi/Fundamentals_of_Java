/*
 * VARIABLE :> 
 * 	=> Variables in Java are containers where we can store values related to different datatypes during the program execution.
 * 	=> These should not be reserved words such as keywords( int , float , char , etc.).
 * 
 * 	:> There are three types of variables in Java :-
 * 		=> Local Variable
 * 			-Declared inside the body of the method.
 * 		
 * 		=> Instance Variable
 * 			-These are defined without the static keyword.
 * 			-They are defined outside the class.
 * 			-They are object specific and are known as instance variables.
 * 
 * 		=> Static Variable
 * 			-These are defined with the static keyword.
 * 			-They are initialize only once, at the start of the program execution.
 * 			-These are not object specific rather they are class variables that means they carries same information to every
 * 			 of that class.
 * 
 * DATATYPES :>
 * 	=>Data types in Java are defined as specifiers that allocate different sizes and types of values that can be stored in the 
 *    variable or an identifier.
 *    
 *    Ex : int a = 10;
 *         int(data type) a (identifier/variable name) = 10(value);
 *         
 *  |----------------------------------------------|      
 *  | DATA TYPE                       DEFAULT SIZE |
 *  | byte                            1 byte       |
 *  | short			      2 bytes      | 
 *  | int 			      4 bytes      |
 *  | long			      8 bytes      |
 *  | float			      4 bytes      |
 *  | double			      8 bytes      |
 *  | boolean			      1 byte       |
 *  | char   			      2 bytes      |
 *  |----------------------------------------------|
 *  
 *  
 * */
package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {

	public static void main(String[] args) {
		
		//Valid declarations of variables in Java
		int     a = 10;
		float   b = 22.56f;
		char    c = 'D';
		double  d = 34.67854d;
		boolean e = true;
		
		//This way these local variables can be printed.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//As static variables do not require to be called through an instance of class. SO , it can be accessed(preferably) by:>
		System.out.println( Wow.ch );
	}
}

class Wow{
	static char ch = 'A';
}
