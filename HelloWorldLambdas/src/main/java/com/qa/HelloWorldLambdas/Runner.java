package com.qa.HelloWorldLambdas;

import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {
		HelloWorldInterface hello = () -> {return "Hello World!";
										};
										
		System.out.println(hello.Hello());
		
		sayHello();
	}
	
	public static void sayHello() {
		Consumer<String> myInterface = (s) -> System.out.println("Hello" + s);
		
		myInterface.accept(" World!");
	}
}
