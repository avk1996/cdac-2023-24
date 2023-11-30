import java.util.Scanner;

class DoubleAverage1
{
	public static void main(String[] args)
	{
		double d1=0.0,d2=0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		boolean check1 = sc.hasNextDouble();
		if(check1==true)
		{
			d1=sc.nextDouble();
		}
		else
		{
			System.out.println("Error: enter double value");
			System.exit(0);
		}
		System.out.println("Enter number 2: ");
		boolean check2 = sc.hasNextDouble();
		if(check2==true)
		{
			d2=sc.nextDouble();
		}
		else
		{
			System.out.println("Error: enter double value");
			System.exit(0);
		}
		if(check1 == true && check2 == true)
		{
			System.out.println("Average: "+((d1+d2)/2));
		}
	}
}
