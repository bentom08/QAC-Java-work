
public class Runner {

		public static void main(String[] args) {
			String myString = "Hello World!";
			System.out.println(myString);
			
			helloWorld();
			System.out.println(returnHelloWorld());
			printString("Hello World!");
		}
		
		public static void helloWorld() {
			System.out.println("Hello World!");
		}
		
		public static String returnHelloWorld() {
			return "Hello World!";
		}
		
		public static void printString(String myString) {
			System.out.println(myString);
		}
}
