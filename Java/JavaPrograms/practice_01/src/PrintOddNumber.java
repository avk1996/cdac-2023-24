//code 1.5
import java.util.Scanner;
class PrintOddNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your beginning number: ");
		int begin = sc.nextInt();
		System.out.println("Enter a range: ");
		int range = sc.nextInt();
		for(int i=begin;i<=range;i++)
		{
			if(i%2!=0)
				System.out.println("Next odd number: "+i);
		}
	}
}
