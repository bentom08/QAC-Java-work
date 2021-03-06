
public class Runner {
	
	static String[] singleDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) {
		System.out.println(numberToWords(500));
	}
	
	public static void oneToTen() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void hundredToThousand() {
		for(int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}
	
	public static String numberToWords(int a) {
		
		String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		int tenDigit = (a/10)%10;
		int endDigit = a%10;
		
		if (a >= 10 && a <= 19) {
			return teens[a - 10];
		} else if (a >= 100 && a <= 999){
			return hundredsToWords(a);
		} else {
			return tens[tenDigit] + " " + singleDigit[endDigit];
		}
	}
	
	public static String hundredsToWords(int a) {
		int hundredDigit = a/100;
		
		if (a%100 == 0) {
			return singleDigit[hundredDigit] + " hundred";
		} else {
			return singleDigit[hundredDigit] + " hundred and " + numberToWords(a - hundredDigit*100);
		}
	}
}
