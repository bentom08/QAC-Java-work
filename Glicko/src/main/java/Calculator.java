import java.lang.Math;

public class Calculator {

	public static double g(double psi) {
		double g = 1 + 3 * psi * psi / (Math.PI * Math.PI);
		return Math.pow(g, -0.5);
	}

	public static double E(double gPsij, double mu, double muj) {
		double d = mu - muj;
		return 1 / (1 + Math.pow(Math.E, -gPsij * d));
	}

	public static double updatePsi(double psi, double vol, double v) {
		double star = 1 / (psi * psi + vol * vol);
System.out.println(Math.pow(star + 1 / v, -0.5));
		return Math.pow(star + 1 / v, -0.5);
	}

	public static double updateMu(double mu, double psi, Game game){
		double I = 0;
		int step = 0;
		while (step < game.getPlayers().length){
			I += g(game.getPlayers()[step].getGlicko().getPsi()) * (game.getScores()[step] - E(game.getPlayers()[step].getGlicko().getPsi(), mu, game.getPlayers()[step].getGlicko().getMu()));
		step ++;
}
		return mu + (psi * psi * I);
		
	}

	public static double delta(Game game, double mu, double v) {
		int i = 0;
		int step = 0;
		while (step < game.getPlayers().length){
			i += g(game.getPlayers()[step].getGlicko().getPsi()) * (game.getScores()[step] - E(g(game.getPlayers()[step].getGlicko().getPsi()), mu, game.getPlayers()[step].getGlicko().getMu()));
		step ++;}
		return v * i;
	}

	public static double f(double x, double delta,double psi, double v, double a, double tau){
		double J = Math.pow(Math.E, x);
		double K = delta * delta - psi * psi - v - Math.pow(Math.E, x);
		double L = 2 * Math.pow(psi * psi + v + Math.pow(Math.E, x), 2);
		double M = (x - a) / (tau * tau);
		return J*K/L - M;
	}
	
	
	public static double updateVol(double delta, double psi, double v,
			 double vol, double tau) {
		double a = 2 * Math.log(vol);
		double epsilon = 0.000001;


		double A = a;
		double B;
		if (delta * delta > psi * psi + v) {
			B = Math.log(delta * delta - psi * psi - v);
		} else {
			int k = 1;
			do  {
				k++;

				B = a - k * tau;
			} while (f((a - k * tau), delta, psi, v, a, tau) < 0);

			double fA = f(A, delta, psi, v, a, tau);
			double fB = f(B, delta, psi, v, a, tau);
			double fC;

			while (Math.abs(B - a) > epsilon) {
				double C = A + (A - B) * fA / (fB - fA);
				fC = f(C, delta, psi, v, a, tau);
				if (fC * fB < 0) {
					A = B;
					fA = fB;
				} else {
					fA = fA / 2;
				}
				B = C;
				fB = fC;

			}
		}
		return Math.pow(Math.E, A / 2);
	}
	
	public static double v(Game game, double mu){
		double I = 0;
		int step = 0;
		while (step < game.getPlayers().length){
			double J = E(game.getPlayers()[step].getGlicko().getPsi(), mu, game.getPlayers()[step].getGlicko().getMu());
			double G = g(game.getPlayers()[step].getGlicko().getPsi());
			I += G * G * J * (1- J);
			step ++;
		}
	return Math.pow(I, -1);
	}
	
	public static void update(Player person, Game game, double tau){
		person.getGlicko().setPsi(updatePsi(person.getGlicko().getPsi(), person.getGlicko().getMu(), v(game,person.getGlicko().getMu())));
		person.getGlicko().setMu(updateMu(person.getGlicko().getMu(), person.getGlicko().getPsi(), game));
		person.getGlicko().setVol(updateVol(delta(game, person.getGlicko().getMu(), v(game,person.getGlicko().getMu())), person.getGlicko().getPsi(),v(game,person.getGlicko().getMu()),person.getGlicko().getVol(), tau ));
	
	}
	
	

}
