/*
 * WAP in Java which would contain 8 objects of a Class Employee. 
 * Employee contains name, age, department, salary. Your program would 
 * be able to calculate the total salary to be paid in each department. Use 
 * constructors to create these 8 objects and Scanner to take inputs.
 */
package Assignment_01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[8];
		
		Scanner obj = new Scanner( System.in );
		
		String name , department;
		int age , salary;
		
		for(int i=0 ; i<8 ; i++) {
			System.out.println("This is test case for 3 names only.");
			
			System.out.println("Enter the details of "+(i+1)+" employee :\n");
			
			System.out.print("Enter the name       : ");
			name = obj.next();
			
			System.out.print("Enter the age        : ");
			age = obj.nextInt();
			obj.nextLine();
			
			System.out.print("Enter the department : ");
			department = obj.next();
			
			System.out.print("Enter the salary     : ");
			salary = obj.nextInt();
			obj.nextLine();
			
			arr[i] = new Employee(name , age , department , salary);
			
			System.out.println("\n");
		}

		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		for( int i=0 ; i<8 ; i++ )
		{
			if( arr[i].department.equals("A") )
			{
				if( arr[i].salary > 30000 )
					a += 25000;
			    else
			    	a += arr[i].salary;
			}
			else if( arr[i].department.equals("B") )
			{
				if( arr[i].salary > 30000 )
					b += 25000;
				else
					b += arr[i].salary;
			}
			else if( arr[i].department.equals("C") )
			{
				if( arr[i].salary > 30000 )
					c += 25000;
				else
					c += arr[i].salary;
			}
			else if( arr[i].department.equals("D") )
			{	
				if( arr[i].salary > 30000 )
					d += 25000;
				else
					d += arr[i].salary;
		    }
		}
   
		System.out.println("salary of department A:"+a+"\nsalary of department B:"+b+"\nsalary of department C:"+c+"\nsalary of department D:"+d);
		obj.close();
	}
}

class Employee{
	String name , department;
	int age , salary;
	
	Employee(){
		
	}
	
	Employee( String name , int age , String department , int salary ){
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
}