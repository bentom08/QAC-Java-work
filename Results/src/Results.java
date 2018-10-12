import java.util.ArrayList;
import java.util.List;

public class Results {

	private int physics;
	private int biology;
	private int chemistry;
	private int total;
	private double percentage;
	
	public Results(int physics, int biology, int chemistry) {
		this.physics = physics;
		this.biology = biology;
		this.chemistry = chemistry;
		this.total = physics + biology + chemistry;
		this.percentage = (double)(total*100)/450;
	}
	
	public void printResults() {
		System.out.println("Physics: " + physics);
		System.out.println("Biology: " + biology);
		System.out.println("Chemistry: " + chemistry);
		
		System.out.println("Total Score: " + total);
	}
	
	public void printPercentage() {
		List<String> failedList = new ArrayList<>();
		if (physics < 90) {
			failedList.add("Physics");
		} if (biology < 90) {
			failedList.add("Biology");
		} if (chemistry < 90) {
			failedList.add("Chemistry");
		}
		
		System.out.println("Total Percentage: " + percentage);
		
		if (percentage >= 60.0 && physics >= 90  && biology >= 90 && chemistry >= 90) {
			System.out.println("You Passed!!");
		} else {
			System.out.println("You Failed :(");
			System.out.println("The modules you failed were:");
			for(int i = 0; i < failedList.size(); i++) {
				System.out.println(failedList.get(i));
			}
		}
	}
}