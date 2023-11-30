//code 1.1
import java.lang.*;
//import: Equivalent to #include preprocessor derictive
//java.lang: Is package path which available implicitly
//*: will invoke all packages
//java.lang.* is available implicitly
//Even thought we comment above import sentence the code will unaffected
public class HelloWorld
//class HelloWorld is allowed
//Rule public class name must be same as source file name
//Rule For a source file their must be one or zero class with a same name (public class per unit source file NOT MORE THAN THAT)
{
	public static void main(String[] Args)
	//public is access specifier
	//static: without instance  can be accessed without instance
	//void: does not return any thing from caller
	//String is class from from package java.lang
	{
		System.out.println("Welcome to java");
		System.out.println("Hello "+Args[0]);
		//System.out is Console o/p
		//out is static object from class System
		//println,print,printf are methods
	}//end of main function
}//end of class
