package Assignment_01;
import java.util.Scanner;

public class Q8 {
	
	public static void main( String args[] ) {
		
		Scanner obj = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements                 : ");
		n = obj.nextInt();
		
		int nums[] = new int[n];
		System.out.print("Enter the numbers                            : ");
		for( int i=0 ; i<n ; i++ ) {
			nums[i] = obj.nextInt();
		}
		
		int index;
		System.out.print("Enter the index of the element to be deleted : ");
		index = obj.nextInt();
		
		for( int i=0 ; i<n ; i++ ) {
			
			if( i == index+1 ) {
				nums[i-1] = nums[i];
			}
		}
		nums[n-1] = 0;
		
		System.out.print("Array after deletion                         : ");
		for( int i=0 ; i<n ; i++ ) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n");
		obj.close();
	}
}