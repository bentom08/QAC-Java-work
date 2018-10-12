package com.qa.Calculator1;

public class Runner {

	public static void main(String[] args) {
		takeNumbers(4,2,8);
		

	}
	public static void takeNumbers(int n1,int n2, int n3) {
		if (n1 + n2 == n3) {
			System.out.println(n1 + "+" + n2 + "=" + n3);
			System.out.println(n3 + "-" + n2 + "=" + n1);
			System.out.println(n3 + "-" + n1 + "=" + n2);
			}
		if (n2 + n3 == n1) {
			System.out.println(n2 + "+" + n3 + "=" + n1);
			System.out.println(n1 + "-" + n2 + "=" + n3);
			System.out.println(n1 + "-" + n3 + "=" + n2);
		} if (n1 + n3 == n2) {
			System.out.println(n1 + "+" + n3 + "=" + n2);
			System.out.println(n2 + "-" + n1 + "=" + n3);
			System.out.println(n2 + "-" + n3 + "=" + n1);
		}
		
		if (n1 * n2 == n3) {
			System.out.println(n1 + "*" + n2 + "=" + n3);
			System.out.println(n3 + "/" + n2 + "=" + n1);
			System.out.println(n3 + "/" + n1 + "=" + n2);
			}
		if (n2 * n3 == n1) {
			System.out.println(n2 + "*" + n3 + "=" + n1);
			System.out.println(n1 + "/" + n2 + "=" + n3);
			System.out.println(n1 + "/" + n3 + "=" + n2);
		} else if (n1 * n3 == n2) {
			System.out.println(n1 + "*" + n3 + "=" + n2);
			System.out.println(n2 + "/" + n1 + "=" + n3);
			System.out.println(n2 + "/" + n3 + "=" + n1);
		}
		
	}
}
