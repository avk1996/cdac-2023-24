//code 1.3
import java.util.Scanner;
class Division
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two doubles: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		//Assumption: Scanner is a class which has methods to accept double value which might be a setter for double
		System.out.println("Division of "+d1+" and "+d2+" is "+(d1/d2));
		sc.close();
	}
}
