package project3;

import java.util.List;

public class ApplicationUtility {
	
	public static Player getPlayerByName(String name) {
		List<Player> players = ApplicationData.getPlayers();
		
		for(Player player : players) {
			String pName = player.getName();
			if(!pName.isEmpty() && pName.contains(name)) {
				return player;
			}
		}
		return null;
	}
	
	public static boolean approvePlayer(String name) {
		List<Player> players = ApplicationData.getPlayers();
		
		for(Player player : players) {
			String pName = player.getName();
			if(!pName.isEmpty() && pName.contains(name)) {
				player.setVerified(true);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Player player = getPlayerByName("Novak");
		
		System.out.println("player status : "+player.isVerified());

		approvePlayer("Novak");

		System.out.println("player status : "+player.isVerified());
	}

}
