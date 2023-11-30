package tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.CandidateDaoImple;
import pojos.Candidate;

public class CandidateDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			CandidateDaoImple cd = new CandidateDaoImple();
			System.out.println("Enter user name and party name: ");
			List<Candidate> cList = cd.getSpecificCanditate(sc.next(), sc.next());
			cList.forEach(System.out::println);
			cd.cleanUp();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
