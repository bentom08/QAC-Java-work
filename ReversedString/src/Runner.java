
public class Runner {

	public static void main(String[] args) {
		System.out.println(reverseAgain("Hello"));

	}
	
	public static String reverse(String myString) {
		String reversed = "";
		for (int i = myString.length() - 1; i >= 0; i--) {
			reversed += String.valueOf(myString.charAt(i));
		}
		
		return reversed;
	}
	
	public static String reverseAgain(String myString) {
		String[] myArray = myString.split("");
		String reversed = "";
		
		for (int i = myArray.length - 1; i >= 0; i--) {
			reversed += myArray[i];
		}
		return reversed;
		
	}
}