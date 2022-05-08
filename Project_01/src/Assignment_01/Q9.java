package Assignment_01;

import Unit_01.SampleClass1;

public class Q9 {
	
	public static void main( String args[] ) {
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a); // this is the member of public class SampleClass1 in Unit_01 package
		
		Access obj1 = new Access( 12 , 13 , 14 , 15 );
		
		System.out.println("Defaut : "+obj1.a);
		System.out.println("Public : "+obj1.b);
		System.out.println("Protected : "+obj1.c);
		
		/*obj1.d can't be accessed outside Access class*/
		//System.out.println("Private : "+obj1.d);
	}
}

class Access{
	int           a;
	public int    b;
	protected int c;
	private int   d;
	
	Access( int a , int b , int c , int d ){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void display() {
		System.out.println("Defaut : "+a);
		System.out.println("Public : "+b);
		System.out.println("Protected : "+c);
		System.out.println("Private : "+d);
		
		return;
	}
}