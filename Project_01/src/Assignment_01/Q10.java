package Assignment_01;

import java.util.Scanner;

public class Q10 {

	public static void main( String args[] ) {
		
		Scanner obj = new Scanner( System.in );
		Survey arr[] = new Survey[4];

		int m , z , w , ms;
		
		for( int i=0 ; i<4 ; i++ ) {
			
			if( i == 0 ) {
				System.out.println("DELHI\n");
			}
			else if( i == 1 ) {
				System.out.println("MUMBAI\n");
			}
			else if( i == 2 ) {
				System.out.println("CHEENAI\n");
			}
			else {
				System.out.println("KOLKATA\n");
			}
			System.out.print("Enter the number of maruti cars     : ");
			m = obj.nextInt();
			
			System.out.print("Enter the number of Zen-Astelo cars : ");
			z = obj.nextInt();
			
			System.out.print("Enter the number of Wagnor cars     : ");
			w = obj.nextInt();
			
			System.out.print("Enter the number of Maruti-SX4 cars : ");
			ms = obj.nextInt();
			
			arr[i] = new Survey( m , z , w , ms );
			System.out.println("\n");
		}
		
		System.out.print("Maruti-k10 car sales among the four cities is : ");
		System.out.println(arr[0].m+arr[1].m+arr[2].m+arr[3].m);
		
		System.out.print("Zen-Astelo car sales among the four cities is : ");
		System.out.println(arr[0].z+arr[1].z+arr[2].z+arr[3].z);
		
		System.out.print("Wagnor car sales among the four cities is     : ");
		System.out.println(arr[0].w+arr[1].w+arr[2].w+arr[3].w);
		
		System.out.print("Maruti-SX4 car sales among the four cities is : ");
		System.out.println(arr[0].ms+arr[1].ms+arr[2].ms+arr[3].ms);
		
		obj.close();
	}
}

class Survey{
	
	int m , z , w , ms;
	Survey( int m , int z , int w , int ms ){
		this.m = m;
		this.z = z;
		this.w = w;
		this.ms = ms;
	}
}