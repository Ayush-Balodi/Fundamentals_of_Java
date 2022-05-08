package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		Employeee obj1 = new Employeee();
		Employeee obj2 = new Employeee();
		Employeee obj3 = new Employeee();
		
		obj1.display(13);
		obj1.display(78);
		obj2.display(90);
		obj3.display(98);
		
		System.out.println("The number of objects created are              : "+Employeee.count1);
		System.out.println("The number of call to the display function are : "+Employeee.count2);
	}
}

class Employeee{
	
	static int count1 = 0 , count2 = 0 ;
	
	Employeee(){
		count1++;
	}
	void display( int num ) {
		
		count2++;
		if( num < 0 ) {
			System.out.println("Number is negative.");
		}
		else if( num > 0 ) {
			System.out.println("Number is positive.");
		}
		else {
			System.out.println("Number is neutral.");
		}
		return;
	}
}