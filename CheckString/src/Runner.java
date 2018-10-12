
public class Runner {

	public static void main(String[] args) {
		String myString = "Hello";
		String myOtherString = "Hello";
		String differentString = "World";
		System.out.println(checkIfHello(myString));
		System.out.println(checkStrings(myString, differentString));
	}
	
	public static boolean checkIfHello(String myString) {
		if (myString == "Hello") {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkStrings(String firstString, String secondString) {
		if (firstString == secondString) {
			return true;
		} else {
			return false;
		}
	}
}
