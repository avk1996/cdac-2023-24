import java.io.*;
import java.util.*;
class FileInput{
	public static void main(String[] args){
	System.out.println("Enter file name: ");
	try(
		Scanner sc = new Scanner(System.in);
		//java app <- BR <- FR <- Text file
		BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
	)
	{
		String line = null;
		int i=0;
		//imperitive style
		/*while((line=br.readLine()) != null){
			i++;
			System.out.println(i+" "+line);
		}*/
		
		//declaretive style (functional programming)
		/*br.lines()//Stream<String>
			.forEach(System.out::println);*/
		/*	.forEach(s -> System.out.println(s));*/

		//upper case conversion using functional programming
		/*br.lines()
			.filter(s -> s.length() > 10)
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);
		*/
		//upper case conversion using method reference      
		/*
		 br.lines()
			.filter(s -> s.length() < 10)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		*/
		 br.lines()
			.map(String::trim)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println("Data read over");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("Main over...");
	}
} 
