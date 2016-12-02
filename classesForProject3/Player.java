package project3;

public class Player extends LoginUser {
	
	private int ranking;
	private int seeding;
	private Coach coach;
	private boolean verified;
	
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getSeeding() {
		return seeding;
	}
	public void setSeeding(int seeding) {
		this.seeding = seeding;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	
}
