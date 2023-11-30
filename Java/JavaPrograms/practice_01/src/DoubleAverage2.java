import java.util.Scanner;

class DoubleAverage2
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		if(sc1.hasNextDouble()==true)
		{
			double d1=sc1.nextDouble();
		}
		else
		{
			System.out.println("Entered value is not double");
			System.exit(1);
		}
		if(sc1.hasNextDouble()==true)
		{
			double d2=sc1.nextDouble();
		}
		else
		{
			System.out.println("Entered value is not double");
			System.exit(1);
		}
		double avg=(d1+d2)/2;
		System.out.println("Average: "+avg);
		sc1.close();
	}
}
