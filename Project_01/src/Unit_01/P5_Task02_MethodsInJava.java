package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		ABC3 obj = new ABC3();
		
		// Calling display method definition
		obj.display2();
		int a = obj.display();
		System.out.println(a);
	}
}

class ABC3 {
	
	int a = 11;
	/*Actual method definition
	 * {data_type} methodName(data_type2 p1, data_type2 p2){
	 * 		methodBody;
	 * }
	 */
	void display2() {
		
		int b = 12;
		int a = 14;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		return a;
	}
}