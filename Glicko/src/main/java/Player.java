
public class Player {

	private Glicko glicko;

	public Glicko getGlicko() {
		return glicko;
	}

	public void setGlicko(Glicko glicko) {
		this.glicko = glicko;
	}
	
	public Player(){
		this.glicko = new Glicko();
	}
	
	public Player(double rating, double rd, double vol){
		this.glicko = new Glicko(rating, rd, vol);
	}
	
	
}
