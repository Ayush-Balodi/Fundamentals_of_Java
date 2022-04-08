/*
 * Operators in Java are symbols which are used to perform operations on operands.
 * 
 * Types of operator in Java:->
 *		-Unary Operator      => {prefix , postfix} [++a,a++,--a,a--,~a,!a] 
 * 		-Arithmetic Operator => {* / % + -}
 * 		-Shift Operator      => {<< >>}
 * 		-Relational Operator => {< > <= >= == !=}
 * 		-Bitwise Operator    => {& ^ |} [bitwise AND, exclusive OR, inclusive OR]
 * 		-Logical Operator    => {&& ||}
 * 		-Terminal Operator   => {? :}
 * 		-Assignment Operator => {= += -= *= %= &= ^= |= <<= >>= >>>=2}
 */

package Unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
		OperatorsInJava obj = new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}
}

class OperatorsInJava{
	void UnaryOperator() {
		
		int a = 10;
		boolean b = false;
		
		System.out.println("Inside UnaryOperator a=10 ");
		System.out.print("a++ = "); // 10
		System.out.println(a++);
		
		System.out.print("++a = ");
		System.out.println(++a); // 12
		
		System.out.print("a-- = ");
		System.out.println(a--); // 12
		
		System.out.print("--a = ");
		System.out.println(--a); // 10
		
		/*Bitwise operator bring us with the two's complement of the input number.
		 */
		System.out.print("~a = ");
		System.out.println(~a); // 1010 ==> 0101+1 ==> 0110
		
		/*Not Operators is used to reverse the value of an operand.*/
		System.out.print("!b = ");
		System.out.println(!b); // true
		System.out.println("\n");
	}
	void ArithmeticOperator() {
		
		System.out.println("Inside Arithmetic Operator");
		
		int a = 10;
		int b = 5;
		
		System.out.println("a => "+a+" and b => "+b);
		
		System.out.print("a+b => ");
		System.out.println(a+b); //15
		
		System.out.print("a-b => ");
		System.out.println(a-b); //5
		
		System.out.print("a*b => ");
		System.out.println(a*b); //50
		
		System.out.print("a/b => ");
		System.out.println(a/b);
		
		System.out.print("a%b => ");
		System.out.println(a%b);
		
		System.out.println(((10*10)/5) + 3 - ((1*4) / 2 )); //21
		System.out.println("\n");
	}
	void ShiftOperator() {
		
		System.out.println("Inside Shift Operator");
		
		System.out.print("10 << 4 => ");
		System.out.println(10<<4); // 10*2^4 = 160
		
		System.out.print("10 >> 4 => ");
		System.out.println(10>>4); // 10/2^4 = 0
		
		System.out.println("\n");
	}
	// result is either true or false
	void RelationalOperator() {
		System.out.println("Inside Relational Operator");
		
		int a = 10;
		int b = 20;
		
		System.out.println("a => "+a+" and b => "+b);
		
		System.out.print("(a == b) => ");
		System.out.println(a == b); // false
		
		System.out.print("(a != b) => ");
		System.out.println(a != b); // true
		
		System.out.print("(a > b)  => ");
		System.out.println(a > b);  // false
		
		System.out.print("(a < b)  => ");
		System.out.println(a < b);  // true
		
		System.out.print("(a >= b) => ");
		System.out.println(a >= b); // false
		
		System.out.print("(a <= b) => ");
		System.out.println(a <= b); // true
		
		System.out.println("\n");
	}
	
	//Bitwise: Second condition is also checked in bitwise AND but not in logical AND and even in ||, that means if first statement is 
	//false, then no need to check for another statement in case of logical AND.
	void BitwiseAndLogicalOperators() {
		
		System.out.println("Inside Bitwise and Logical Operators");
		
		int a = 10;
		int b = 4;
		int c = 20;
		
		System.out.println(a<b && a++<c); //false && true = false
		System.out.println(a); // a=10 as second condition is not checked above.
		
		System.out.println(a<b & a++<c); //false & true => false
		System.out.println(a); // a =11 as second condition is also checked above.
		
		// || and | and ^
		System.out.println("\n");
	}
	
	void TernaryOperator() {
		
		System.out.println("Inside Ternary Operator");
		
		int a = 2;
		int b = 5;
		
		System.out.println("a => "+a+" and b => "+b);
		
		int min = (a < b) ? a : b;
		System.out.println(min); // 5
		
		System.out.println("\n");
	}
	
	void AssignmentOperator() {
		
		System.out.println("Inside Assignment Operator");
		
		int a = 10;
		int b = 20;
		
		a += 4; // a = a+4 => 14
		b -= 4; // b = b-4 => 16
		
		System.out.println("a => "+a+" and b => "+b);
		
		b >>>= 2; // b = b >>> 2 => b*
		System.out.println(b);
		
		System.out.println("\n");
	}
}