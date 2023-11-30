//code 1.2 
//import java.lang.*
class SumTwoInt
{
	public static void main(String args[])
	{
		System.out.println("Following printed is string based: ");
		System.out.println("Sum = "+(args[0]+args[1]));
		//when we give any argument (int,float or character) it will accept as string and concatanate with each other
		//Alternate way to do sum we parse/convert the input argument to integer by the following
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		//Warning: always give integer NOT any other format or it will give NumberFormatException(NFE)
		//Again print with the same format
		System.out.println("Printed by actually parsing the token into integer");
		System.out.println("Sum = "+(num1+num2));

	}
}
//Remember: String and int are two incompactiable type
