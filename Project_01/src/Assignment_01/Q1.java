package Assignment_01;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		String name;
		int age;
		float percentage;
		
		Scanner obj = new Scanner(System.in);
		
		Student arr[] = new Student[6];
		
		for(int i=0 ; i<6 ; i++) {
			
			System.out.println("Enter the details of "+(i+1)+" student :\n");
			
			System.out.print("Enter the name       : ");
			name = obj.nextLine();
			
			System.out.print("Enter the age        : ");
			age = obj.nextInt();
			
			System.out.print("Enter the percentage : ");
			percentage = obj.nextFloat();
			
			arr[i] = new Student(name , age , percentage);
			
			System.out.println("\n");
		}
		
		float average = 0.0f;
		
		for(int i=0 ; i<6 ; i++) {
			average += arr[i].percentage;
		}
		
		System.out.println("The average percentage is : "+(average/6)+"\n");
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