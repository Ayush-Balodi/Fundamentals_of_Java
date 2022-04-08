/*
 # Control Statements and conditional statements:-
   -Java provides three types of control flow statements.
   -Decision making statements
   		-if statement
   		-switch statement
   		
   -Loop statements
   		-do while loop
   		-while loop
   		-for-each loop
   		
   -Jump statements
   		-break statement
   		-continue statement
 */
package Unit_01;

public class P4_Task01_ControlAndConditinalStatementsInJava {

	public static void main(String[] args) {
		Statements obj = new Statements();
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}

class Statements{
	
	void DecisionMakingStatements() {
		int x = 10;
		int y = 43;
		
		if( x < y ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int num = 2;
		
		// can we use char instead of int as num??
		switch( num ) { // switch( expression )
			case 0:
				System.out.println("number is zero");
				break;
			case 1:
				System.out.println("number is one");
				break;
			case 2:
				System.out.println("number is two");
				break;
			default:
				System.out.println("num is "+num);
				break;
		} 
	}
	
	void LoopStatements() {
		
		// for( initialization ; condition ; updation ){ statement }
		// for( data_type var : array_name/collection name){ statement }
		
		int sum = 0;
		for( int i=0 ; i<= 10 ; i++ ) {
			sum += i;
		}
		System.out.println("Sum of first ten natural numbers is : "+sum);
		
		// for each
		String[] names = {"Java","C++","Python","Solidity","MySql"};
		System.out.println("Printing the content of the array names :- \n");
		
		for( String name : names ) {
			System.out.println(name);
		}
		
		// while( condition ) { statement }
		int i=0; sum = 0;
		while( i < 10 ) {
			sum += i;
			i++;
		}
		System.out.println("Sum of first nine natural numbers is : "+sum+"\n");
		
		// do{ statement }while( condition );
		i=1;
		do {
			System.out.println(i);
			i++;
		}while( i <= 10 );
	}
	
	void JumpStatements() {
		
		//break;
		System.out.println("Checking break at 12 :- \n");
		for( int i=0 ; i<18 ; i++ ) {
			if( i == 12 ) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//continue
		System.out.println("Checking continue at 12 :- \n");
		for( int i=0 ; i<18 ; i++ ) {
			if( i == 12 ){
				continue;
			}
			System.out.println(i);
		}
	}
}