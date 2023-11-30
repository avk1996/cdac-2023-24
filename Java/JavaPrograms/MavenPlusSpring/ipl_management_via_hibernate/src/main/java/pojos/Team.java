package pojos;

import javax.persistence.*;

/*
 * team_id | name| abbrevation | owner  | max_age | batting_avg | wickets_taken
 */
@Entity // mandatory cls level annotation , to tell hibernate ,
//following is the entity
		// class , whose life cycle to be managed by hibernate
@Table(name="teams_tbl")
public class Team {
//	create table teams (team_id int primary key auto_increment,name varchar(100),abbrevation varchar(10),owner varchar(20),max_age int,
//			batting_avg double,wickets_taken int);
	
	@Id //mandatory anno , to place PK constraint
	//for auto id generation , using auto increment constraint
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Team_Id")
	private Integer teamId;// as per the founder(Gavin King) , till hib 5 , use id prop : explicitly
							// serializable
	@Column(name="Team_name",length=30)
	private String name;
	@Column(length=10)
	private String abbreviation;
	@Column(name="Team_Owner",length=20)
	private String owner;
	@Column(name="Max_Age")
	private int maxAge;
	@Column(name="Min_Batting_Avg")
	private double minBattingAvg;
	@Column(name="Min_Wickets_Taken")
	private int minWicketsTaken;

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String name, String abbreviation, String owner, int maxAge, double minBattingAvg,
			int minWicketsTaken) {
		super();		
		this.name = name;
		this.abbreviation = abbreviation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.minBattingAvg = minBattingAvg;
		this.minWicketsTaken = minWicketsTaken;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getMinBattingAvg() {
		return minBattingAvg;
	}

	public void setMinBattingAvg(double minBattingAvg) {
		this.minBattingAvg = minBattingAvg;
	}

	public int getMinWicketsTaken() {
		return minWicketsTaken;
	}

	public void setMinWicketsTaken(int minWicketsTaken) {
		this.minWicketsTaken = minWicketsTaken;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", abbreviation=" + abbreviation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", minBattingAvg=" + minBattingAvg + ", minWicketsTaken=" + minWicketsTaken
				+ "]";
	}

}
