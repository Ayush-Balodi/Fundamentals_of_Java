package Assignment_01;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		
		for(int i=0 ; i<6 ; i++) {
			System.out.println("Enter the details of "+(i+1)+" student :");
			System.out.println("Enter the name : ");
			
		}
		obj.close();
	}
}

class Student{
	String name;
	int age;
	static final char section = 'A';
	float percentage;
	
	Student(){
		
	}
	Student(String name , int age , float percentage){
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
}
