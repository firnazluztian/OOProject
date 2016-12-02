package project3;

import java.util.ArrayList;
import java.util.List;

class ApplicationData {
	 
	 static List<Player> players = new ArrayList<Player>();
	 static List<SystemAdmin> systemAdmins = new ArrayList<SystemAdmin>();
	 static List<ATPOfficial> atpOfficials = new ArrayList<ATPOfficial>();
	 static List<Coach> coaches = new ArrayList<Coach>();	 
	 static List<ChairUmpire> chairUmpires = new ArrayList<ChairUmpire>();	 
	 static List<LineUmpire> lineUmpires = new ArrayList<LineUmpire>();	 

	 static {
		addInitialCoaches();
		addInitialPlayers();
		addInitialSystemAdmins();
		addInitialATPOfficials();
		addLineUmpires();
		addChairUmpires();
	}


	private static void addInitialCoaches() {
		
		Coach coach = new Coach();
		coach.setName("Boris Becker");
		coach.setCountry("Germany");
		coach.setEmail("becker@mail.com");
		coach.setCoachingRanking(2);
		
		getCoaches().add(coach);
	}


	private static void addInitialATPOfficials() {
		
		ATPOfficial atpOfficial = new ATPOfficial();
		atpOfficial.setName("ATP Official 1");
		atpOfficial.setEmail("atp1@mail.com");
		atpOfficial.setCountry("France");
		atpOfficial.setUsername("atp_1");
		atpOfficial.setPassword("1234");
		atpOfficial.setAtpId("ATP111");
		
		getAtpOfficials().add(atpOfficial);
		
	}


	private static void addInitialSystemAdmins() {

		SystemAdmin systemAdmin = new SystemAdmin();
		systemAdmin.setName("System Administrator");
		systemAdmin.setEmail("system@mail.com");
		systemAdmin.setCountry("USA");
		systemAdmin.setUsername("admin");
		systemAdmin.setPassword("1234");
		
		getSystemAdmins().add(systemAdmin);
	}


	private static void addInitialPlayers() {
		
		Player player = new Player();
		player.setName("Novak Djokovic");
		player.setEmail("novak@mail.com");
		player.setCountry("Serbia");
		player.setRanking(1);
		player.setSeeding(1);
		player.setUsername("novak");
		player.setPassword("1234");
	
		Coach coach1 = getCoaches().get(0);

		player.setCoach(coach1);
		
		getPlayers().add(player);
		
	}
	
	private static void addChairUmpires() {
		
		ChairUmpire chairUmpire = new ChairUmpire();
		chairUmpire.setName("Chair Umpire 1");
		chairUmpire.setCountry("India");
		chairUmpire.setEmail("chair@mail.com");
		chairUmpire.setUmpireId("UMP123");
		chairUmpire.setUsername("chair_1");
		chairUmpire.setPassword("1234");
		
		getChairUmpires().add(chairUmpire);
	}
	
	private static void addLineUmpires() {
		
		LineUmpire lineUmpire = new LineUmpire();
		lineUmpire.setName("Chair Umpire 1");
		lineUmpire.setCountry("India");
		lineUmpire.setEmail("chair@mail.com");
		lineUmpire.setUmpireId("UMP123");
		
		getLineUmpires().add(lineUmpire);
	}

	public static List<Player> getPlayers() {
		return players;
	}

	public static List<SystemAdmin> getSystemAdmins() {
		return systemAdmins;
	}

	public static List<ATPOfficial> getAtpOfficials() {
		return atpOfficials;
	}

	public static List<Coach> getCoaches() {
		return coaches;
	}


	public static List<ChairUmpire> getChairUmpires() {
		return chairUmpires;
	}


	public static List<LineUmpire> getLineUmpires() {
		return lineUmpires;
	}

	public static void main(String[] args) {
		
		List<Player> players = getPlayers();
		
		for(Player player : players) {
			System.out.println("Player's name : "+player.getName());
			System.out.println("Player's email : "+player.getEmail());
			System.out.println("Player's rank : "+player.getRanking());
		}
		
	} 
}
