
public class Runner {

	public static void main(String[] args) {
		System.out.println(addUniques(5, 5, 4));
	}
	
	public static int addUniques(int a, int b, int c) {
		if (a == b) {
			if (b == c) {
				return 0;
			}
			return c;
		} else if (b == c) {
			return a;
		} else if (a == c) {
			return b;
		} else {
			return a+b+c;
		}
 	}
}