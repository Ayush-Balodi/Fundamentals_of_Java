package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

/*Updated*/
public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = "75457";
		String s2 = "75457";

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
     	obj.stringEqualOrNot(s1, s2);
     	obj.stringEqualOrNot2(s1, s2);
	}
}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int n = s.length();
		int i = 0, c = 0, j = n - 1;

		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				c = 1;
				break;
			}
			i++;
			j--;
		}

		if (c == 0) {
			System.out.println("Yes, it is a palindrome.");
		} else {
			System.out.println("No, it is not a palindrome.");
		}
	}

	void reverseOfAString(String s) {
		
		int n=s.length() , i=n-1;
		String str="";

		while( i >= 0 ) {
			str += s.charAt(i);
			i--;
		}
		System.out.print("Reversed string : ");
		System.out.println(str); // a5457
	}

	void stringEqualOrNot(String s1, String s2) {
		int n1 = s1.length() , c=0;

		for( int i=0 ; i<n1 ; i++ ){
			if (s1.charAt(i) != s2.charAt(i)) {
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Yes, they are equal.");
		} else {
			System.out.println("No, they are not equal.");
		}
	}
	
	void stringEqualOrNot2(String s1, String s2) {
		boolean b = s1.equals(s2);
		
		if( b == true ) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
	}
}