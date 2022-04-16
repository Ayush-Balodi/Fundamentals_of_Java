package Unit_02;

public class P10_Task01_OverloadingAndOverridingInJava {
	
	public static void main(String args[]) {
		OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();
		
		System.out.println("add() with two parameter :-> ");
		System.out.println(obj.add(4,5));
		
		System.out.println("add() with 3 parameter   :->");
		System.out.println(obj.add(2,3,4));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(2,3));
		System.out.println(obj2.add(2,3,4));
	}
}

class OverloadingAndOverridingInJava{
	
	//within the same class : Method overloading
	int add( int a , int b ) {
		System.out.println("Inside, OverloadingAndOverridingInJava !");
		return (a+b);
	}
	
	int add( int a, int b , int c ) {
		System.out.println("Inside, OverloadingAndOverridingInJava !");
		return(a+b+c);
	}
}

//Overriding in Java : Required Inheritance !
class InheritFirstOne extends OverloadingAndOverridingInJava{
	
	int add( int a , int b ) {
		System.out.println(super.add(a, b));
		System.out.println("Inside, InheritFirstOne !");
		return (a+b+1);
	}
	
	int add( int a , int b , int c ) {
		System.out.println("Inside, InheritFirstOne !");
		return (a+b+c);
	}
}