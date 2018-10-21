
public class Game {
	
	private Player[] players;
	private double[] scores;
	
	
	public Player[] getPlayers() {
		return this.players;
	}
	
	public Game(Player[] players, double[] scores){
		this.players = players;
		this.scores = scores;
	}
	
	public double[] getScores(){
		return this.scores;
	}

	
	

}
