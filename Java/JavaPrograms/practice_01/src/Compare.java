import java.util.Scanner;

class Compare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//if we input non-integer then we will get InputMismatchError
		if(num1 > num2)
			System.out.println(num1+" is greater than "+num2);
		else if(num1 < num2)
			System.out.println(num2+" is greater than "+num1);
		else
			System.out.println("Numbers are equal");
	}
}
