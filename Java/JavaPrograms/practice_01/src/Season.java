import java.util.Scanner;

class Season
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		
		while(run)
		{
			System.out.println("Enter month number: 1-12");
			//way 1: create seperate integer and pass to switch
			/*int choice = sc.nextInt();
			switch(choice)*/
			//way 2: pass within switch case
			switch(sc.nextInt())
			{
				case 1: 
				case 2:
				case 11:
				case 12:
					System.out.println("Its winter bro! :-()");
					break;
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("Its summer bro! :|");
					break;
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("Its rainy brother :]");
					break;
				default:
					run=false;
					System.out.println("Do you even know months bro? :|");
					break;
			}
		}	
	}
}
