/*
 * Piece of data/code that would never change
 * Constants never change once a value is assigned
 * 	=> final keyword make the variable constant
 * 
 *Access:-
 *	=> public    :=> class + within same project
 *	=> private   :=> only accessible in same class
 *	=> protected :=> same class + sub class + same project non-sub class
 *
 *static :=> can be accessed without making of an object of that class , more about this in further programs.
*/
package Unit_01;

public class P2_Task02_ConstantsInJava {
	
	private static final double pi = 3.142;
	
	public static void main(String[] srgs){
		
		//final keyword assures that once given the value 10 given to this , cannot be modified 
		final int a = 10;
		//Error : a=11;
		
		//we have to make pi static to call it here
		System.out.println(pi);
		
		System.out.println(a);
		
		//since it is static, then only we are able to call it from here.
		System.out.println(add(5,14));
		
		calculate object = new calculate();
		System.out.println(object.ans);
		
		//can be accessed without making of an object of that class
		//static is once declared share among all the instances of a class
		System.out.println(calculate.g);
	}
	
	static int add( int a , int b ){
		
		//here it will print a from local variable
		System.out.println(a);
		
		System.out.println(pi);
		
		return (a+b);
	}
}

class calculate{
	int ans = 23;
	
	static int g = 55;
	
	void add() {
		
		//Error :=> As pi is visible to above class only, it is inaccessible here.
		//System.out.println(pi);
		
		System.out.println(ans);
	}
}