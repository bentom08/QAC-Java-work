
public class Runner {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(adder(a, b));
		System.out.println(subtractor(a, b));
		System.out.println(multiplier(a, b));
		System.out.println(divider(a, b));
		System.out.println(chooseOperator(a, b, "multiply"));
	}
	
	public static int adder(int a, int b) {
		return a+b;
	}
	
	public static int subtractor(int a, int b) {
		return a-b;
	}
	
	public static int multiplier(int a, int b) {
		return a*b;
	}
	
	public static int divider(int a, int b) {
		return a/b;
	}
	
	public static double divider(double a, double b) {
		if (b < a) {
			System.out.println("Division cannot be performed");
			return 0.0;
		} else {
			return a/b;
		}
	}
	
	public static int chooseOperator(int a, int b, String operator) {
		if (operator.equals("add")) {
			return adder(a, b);
		} else if (operator.equals("subtract")) {
			return subtractor(a, b);
		} else if (operator.equals("multiply")) {
			return multiplier(a, b);
		} else if (operator.equals("divide")) {
			return divider(a, b);
		} else {
			System.out.println("add, subtract, multiply or divide");
			return 0;
		}
	}
}
