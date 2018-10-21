
public class runTime {
	 public static void main( String[] args ){
	double tau = 0.5; // System variability
	
	double[] game1scores = {1,1,1,0};
	Player[] game1players = {new Player(),new Player(),new Player(),new Player()};
	
	Player joseph = new Player();
	
	Game game1 = new Game(game1players, game1scores);
	System.out.print(joseph.getGlicko());
System.out.println(game1players[0].getGlicko());
	Calculator.update(joseph, game1, tau);
	
	System.out.print(joseph.getGlicko());
}}
