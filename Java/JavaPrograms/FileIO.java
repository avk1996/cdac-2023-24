import java.io.*;
import java.util.*;
class FileIO{
	public static void main(String[] args){
	System.out.println("Enter file name: ");
	try(
	Scanner sc = new Scanner(System.in);
	//java app <- BR <- FR <- Text file
	BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
	//java app -> PW -> FW -> Text file
	PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(),true));
		)
	{
		String line = null;
		br.lines()
			.filter(s -> s.length() < 20)
			.map(String::toUpperCase)
			.forEach(pw::println);
		//or
		//br.lines().forEach(s -> pw.println(s));
		System.out.println("Data write over");

	}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("Main over...");
	}
} 
