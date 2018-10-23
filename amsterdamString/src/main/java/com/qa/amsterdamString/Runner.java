package com.qa.amsterdamString;

public class Runner {

	public static void main(String[] args) {
		System.out.println(amFinder("a"));
	}
	
	public static int amFinder(String s) {
		
		s = s.toLowerCase();
		int n = 0;
		
		if (s.length() < 2) {
			return 0;
		}
		
		if (s.length() == 2) {
			if(s.substring(0, 2).equals("am")) {
				return 1;
			} else {
				return 0;
			}
		}
		
		if (s.substring(0, 3).equals("am ")) {
			n++;
		}
		
		if (s.substring(s.length() - 3,s.length()).equals(" am")) {
			n++;
		}
		
		for (int i = 0; i < s.length() - 3; i++) {
			if (s.substring(i, i+4).equals(" am ")) {
				n++;
			}
		}
		
		return n;
	}
}
