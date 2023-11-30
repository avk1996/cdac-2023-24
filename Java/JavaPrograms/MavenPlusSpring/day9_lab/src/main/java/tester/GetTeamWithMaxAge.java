package tester;

import java.util.List;
import java.util.Scanner;

import dao.TeamDaoImpl;

public class GetTeamWithMaxAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter max age: ");
			TeamDaoImpl dao = new TeamDaoImpl();

			List<String> list = dao.getTeamWithMaxAge(sc.nextInt());
			//System.out.println(list);
			if (list.isEmpty())
				System.out.println("No teams available!");
			else {
				System.out.println("Team who need players with max age greater than your age are");
//			System.out.println("out: "+list.get(0));
				list.forEach(System.out::println);
				// list.forEach(l->System.out.println(l.getName()+" "+l.getAbbreviation()));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
