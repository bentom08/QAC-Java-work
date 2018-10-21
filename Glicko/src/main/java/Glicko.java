public class Glicko{
	
	private double rating;
	private double rd;
	private double vol;
	
	
	public Glicko(){
		this.rating = 0;
		this.rd = 350;
		this.vol = 0.06;
	}
	
	public Glicko(double rating, double rd, double vol){
		this.rating = (rating-1500)/173.7178;
		this.rd = rd/173.7178;
		this.vol = vol;
	}
	
	public double getRating(){
		return (this.rating*173.7178)+1500;
	}
	
	public void setRating(double Rating){
		this.rating = (rating-1500)/173.7178;
	}
	
	public void setMu(double mu){
		this.rating = mu;
	}
	
	public double getMu(){
		return this.rating;
	}
	
	public void setPsi(double psi){
		this.rd = psi;
	}
	
	public double getPsi(){
		return this.rd;
	}
	
	public double getRd(){
		return this.rd*173.7178;
	}
	
	public void setRd(double rd){
		this.rd = rd/173;
	}
	
	public double getVol(){
		return this.vol;
	}
	
	public void setVol(double vol){
		this.vol = vol;
	}

	public String toString(){
		return this.getRating() + "; " + this.getRd() + ": " + this.vol;
	}
	
	
}