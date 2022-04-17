/*
 - A Java pacjkage is a group of similar types of classes, interfaces and sub-packages.
 - Package in Java can be categorized in two form :->
 		- Built-in package {lang, awt, javax, swing, net, io, util, sql}
 		- User-defined package
 		
 - Package also help to avoid class name collision.
 - Package also helps us to maintain access protection in Java.
 - Packages are named in reverse order of domain names.
  	- unit_02.javaproject.com => "com.javaproject.unit_02"
  	
 import java.util.vector; // import the vector class from util package.
 import java.util.*;      // import all the classes from util package.
 
 Static Import ;->
 - Static import is a feature introduced in Java programming language( version 5 and above )
   that allow members( fields and methods ) defined in a class as public static, to be used in Java
   code without specifying the class in which the field is defined.
 */

package Unit_02; // Inside this package we can create many classes !

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1;

public class P11_Task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.4));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);
	}
}
