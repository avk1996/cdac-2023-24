package dao;

import static utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Team;

public class TeamDaoImpl implements TeamDao {

	@Override
	public String addTeamDetails(Team newTeam) {
		// 1. open hibernate session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			session.save(newTeam);
			// end of try => success
			tx.commit();
		} catch (RuntimeException e) {
			// rollback tx n re throw the exc to the caller
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "Added new Team with ID " + newTeam.getTeamId();
	}

	@Override
	public List<Team> getSeletedTeamDetails(String abbr) {
		List<Team> list = null;
		Session session = getFactory().getCurrentSession();
		String jpql = "SELECT t FROM Team t WHERE t.abbreviation = :abbr";
		Transaction tx = session.beginTransaction();

		try {
			list = session.createQuery(jpql, Team.class).setParameter("abbr", abbr).getResultList();

			tx.commit();
		} catch (RuntimeException e) {
			// TODO: handle exception
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return list;
	}

	@Override
	public List<String> getTeamWithMaxAge(int age) {
		List<String> list = null;
		Session session = getFactory().getCurrentSession();
		String jpql = "SELECT t.name FROM Team t WHERE t.maxAge > :a";
		Transaction tx = session.beginTransaction();
		try {
			list = session.createQuery(jpql, String.class).setParameter("a", age).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			// TODO: handle exception
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return list;
	}

	@Override
	public Team updateTeamStats(int teamid) {
		Team team= null;
		Session session = getFactory().getCurrentSession();
//		String jpql = "SELECT t FROM Team t WHERE t.teamId";
		
		Transaction tx = session.beginTransaction();
		try {
			team =  session.get(Team.class, teamid);
			tx.commit();
		} catch (RuntimeException e) {
			// TODO: handle exception
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return team;
	}
}
