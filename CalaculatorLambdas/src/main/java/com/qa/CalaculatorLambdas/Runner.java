package com.qa.CalaculatorLambdas;

public class Runner {

	static MathOperation addition = (x, y) -> x + y;
	
	static MathOperation subtraction = (x, y) -> x - y;
	
	static MathOperation multiplication = (x, y) -> x * y;
	
	static MathOperation division = (x, y) -> x / y;
	
	public static void main(String[] args) {
		System.out.println(calculator(10, 5, division));
	}
	
	public static int calculator(int a, int b, MathOperation operator) {
		return operator.operation(a, b);
	}
}