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
}