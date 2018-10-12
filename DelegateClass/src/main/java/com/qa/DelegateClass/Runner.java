package com.qa.DelegateClass;

public class Runner {

	public static void main(String[] args) {
		Delegate joseph = new Delegate(3, 56, "Joseph");
		Delegate ben = new Delegate(9, 31, "Ben");
		
		System.out.println(ben.getName());
		
		ben.setName("Benjamin");
		
		System.out.println(ben.getName());
	}

}
