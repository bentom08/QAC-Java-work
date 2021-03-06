package com.qa.Factorials;

public class Runner {

	public static void main(String[] args) {
		System.out.println(reverseFactorial(23478356));
	}
	
	public static String reverseFactorial(int result) {
		int n = 1;
		int factorial = result;
		
		while (result != 1) {
			result /= n;
			n++;
			if (result == 0) {
				return "NONE";
			}
		}
		
		return (n - 1) + "!" + " = " + factorial;
	}
}
