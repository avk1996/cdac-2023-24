package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.OnlineVotingDAOImple;
import pojo.Candidates;

public class OnlineVotingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			OnlineVotingDAOImple cd = new OnlineVotingDAOImple();
			
			System.out.println("Authenticate email and password: ");
			System.out.println("Enter email and password: ");
			boolean authTrue = cd.authenticateVoter(sc.next(),sc.next());
			if(authTrue) {
				System.out.println("Access Granted!");
			}
			else
				System.out.println("Access Denied");
			
			System.out.println("Update status: ");
			System.out.println("Enter id to update voting status:");
			cd.updateVoterStatus(sc.nextInt());
			
			System.out.println("Give vote:");
			System.out.println("Enter party name, email and password: ");
			cd.increamentCandidateVotes(sc.next(), sc.next(), sc.next());
			
			System.out.println("Display all candidates: ");
			List<Candidates> cList = cd.displayAllCandidates();
			cList.forEach(System.out::println);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
