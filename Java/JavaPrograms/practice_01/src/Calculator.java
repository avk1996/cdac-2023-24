import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		double result=0;
		int choice;
		do
		{
			System.out.println("---Calculator---\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Exit");
			System.out.println("Enter number 1: ");
			num1=sc.nextDouble();
			System.out.println("Enter number 2: ");
			num2=sc.nextDouble();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: result = num1+num2;
					break;
				case 2: result = num1-num2;
					break;
				case 3: result = num1*num2;
					break;
				case 4: result = num1/num2;
					break;
				case 5: System.out.println("EXIT");
					System.exit(0);
					break;
				default: System.out.println("Invalid Choice");
					break;
			}	
			System.out.println("Result: "+result);
		}
		while(choice!=5);
	sc.close();
	}
}
