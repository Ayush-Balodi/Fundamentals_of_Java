/*
Keywords are reserved words that your are not supposed to use in the program as they have predefined meaning.
->Method
->Variables
->Objects

50 keywords are there in Java where 48 are used and 2 are for future use.
->goto*[future]
->const*[future]

Versions of Java => 1.2v,1.4v,5.0v
- not used => *    [goto* , const*]
- 1.2v     => **   [assert**]
- 1.4v     => ***  [sctrictfp***]
- 5.0v     => **** [enum****]
*/
package Unit_01;

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		System.out.println("Java Keywords!");
		
		//Syntax error on token "int", delete this token
		ABC int = new ABC();
	}
	
	//Syntax error on token "int", Identifier expected
	void int() {
			
	}
	
	//Syntax error on token "double", invalid VariableDeclaratorId
	int double = 10;
}

class ABC{
	int x=5;
}