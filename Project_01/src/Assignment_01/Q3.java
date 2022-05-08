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