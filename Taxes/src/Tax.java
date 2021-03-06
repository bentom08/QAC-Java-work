
public class Tax {

	private int salary;
	private double taxPercent;
	private double taxedAmount;
	
	public Tax(int salary) {
		this.salary = salary;
	}
	
	public void taxPercent() {
		if (salary <= 14999 && salary >= 0) {
			taxPercent = 0.0;
		} else if (salary >= 15000 && salary <= 19999) {
			taxPercent = 0.1;
		} else if (salary >= 20000 && salary <= 29999) {
			taxPercent = 0.15;
		} else if (salary >= 30000 && salary <= 44999) {
			taxPercent = 0.2;
		} else if (salary >= 45000) {
			taxPercent = 0.25;
		}
	}
	
	public void printTaxedAmount() {
		taxPercent();
		taxedAmount = salary - salary*taxPercent;
		System.out.println(taxedAmount);
	}
}
