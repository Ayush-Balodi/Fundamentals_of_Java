package Unit_02;

//import java.io.*;
import java.util.Scanner;

public class test{
	//public final float pi = 3.14f;
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);		
		int num = obj.nextInt();
		String name = obj.next();
		boolean b = obj.nextBoolean();
		
		System.out.println(num);
		System.out.println(b);
		System.out.println(name);
		
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		
		for( int i=0 ; i<n ; i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		obj.close();
	}
}

class ABCDE{
	final int add( int a , int b ) {
		//System.out.println(pi);
		return (a+b);
	}
	static int sub( int a , int b ) {
		return (b-a);
	}
}

class XYZ extends ABCDE{
	
	/*This override is working but not the next one.*/
	/*Ihave made this function in above class final but not everytime it holds true.*/
	int add( int a , int b , int c ) {
		return (a+b+c);
	}
	
	/*ERROR as expected => true*/
//	int add( int a , int c ) {	
//		return(a*b);
//	}
}

/*Difference between these ::
	String s = "Hello There!";
	String s1 = new String("abcdefgh");
*/