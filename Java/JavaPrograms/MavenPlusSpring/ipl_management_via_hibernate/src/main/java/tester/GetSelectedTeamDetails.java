package tester;

import java.util.List;
import java.util.Scanner;

import dao.TeamDaoImpl;
import pojos.Team;

public class GetSelectedTeamDetails {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter team abbr: ");
			TeamDaoImpl dao = new TeamDaoImpl();
			
			List<Team> list = dao.getSeletedTeamDetails(sc.next());
			System.out.println("Selected team details: ");
			System.out.println("out: "+list.get(0));
			list.forEach(System.out::println);
			list.forEach(l->System.out.println(l.getName()+" "+l.getAbbreviation()));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
