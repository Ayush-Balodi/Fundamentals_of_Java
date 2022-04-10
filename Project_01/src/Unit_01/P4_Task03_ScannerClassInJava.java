/*When user takes input from the console!
 * 
 * nextLine()     =>Read user input [to read Strings]
 * next()         =>Read next token from the input entered by the user
 * nextBoolean()  =>Reads a boolean value from the user
 * nextByte()     =>Reads a byte value from the user
 * nextDouble()   =>Reads a double value from the user
 * nextFloat()    =>Reads a float value from the user
 * nextInt()      =>Reads a int value from the user
 * nextLine()     =>Reads a string value from the user
 * nextLong()     =>Reads a long value from the user
 * nextShort()    =>Reads a short value from the user
 * 
 */
package Unit_01;
import java.util.Scanner;

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in); //Create a Scanner object
		Scanner obj2 = new Scanner(System.in);
		
		
		// Read the First-Token:(_ space bar)
		String firstName = obj1.next();
		System.out.println("Name is : " + firstName +"\n");
		
		
		String name = obj2.nextLine();//(\n)
		String name2 = obj2.nextLine();//(\n)
		
		int num = obj1.nextInt();
		System.out.println("Num : "+num);
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name2 + "\n");
		
		boolean b = obj2.nextBoolean();
		System.out.println(b + "\n");
		
		obj1.close();
		obj2.close();
	}
}