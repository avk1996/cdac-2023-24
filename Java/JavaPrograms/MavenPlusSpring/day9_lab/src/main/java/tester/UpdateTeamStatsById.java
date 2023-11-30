package tester;

import java.util.List;
import java.util.Scanner;

import dao.TeamDaoImpl;
import pojos.Team;

public class UpdateTeamStatsById {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Team Id: ");
			TeamDaoImpl dao = new TeamDaoImpl();

			Team team = dao.updateTeamStats(sc.nextInt());
			// System.out.println(list);
			System.out.println("Enter New Minimum Batting Average and Minimum Wickets Taken: ");

			team.setMinBattingAvg(sc.nextDouble());
			team.setMinWicketsTaken(sc.nextInt());
			System.out.println(team);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
