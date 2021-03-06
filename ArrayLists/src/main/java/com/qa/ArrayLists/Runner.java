package com.qa.ArrayLists;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
		onlyUniques(numbers);
	}

	public static void printList(List<Integer> myList) {
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}

	public static void printEvens(List<Integer> myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) % 2 == 0) {
				System.out.println(myList.get(i));
			}
		}
	}

	public static void printTenTimes(List<Integer> myList) {
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i) * 10);
		}
	}

	public static void printHighest(List<Integer> myList) {
		int highest = myList.get(0);
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) > highest) {
				highest = myList.get(i);
			}
		}
		System.out.println(highest);
	}

	public static void printLowest(List<Integer> myList) {
		int lowest = myList.get(0);
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) < lowest) {
				lowest = myList.get(i);
			}
		}
		System.out.println(lowest);
	}

	public static void createListOfSquares(List<Integer> myList) {
		List<Integer> squaredList = new ArrayList<Integer>();

		for (int i = 0; i < myList.size(); i++) {
			squaredList.add(myList.get(i) * myList.get(i));
		}
		System.out.println(squaredList);
	}

	public static void removeDupes(List<Integer> myList) {
		List<Integer> uniqueList = new ArrayList<Integer>();

		for (int i = 0; i < myList.size(); i++) {

			int n = 0;

			for (int j = 0; j < uniqueList.size(); j++) {

				if (uniqueList.get(j) == myList.get(i)) {

					n++;
				}
			}

			if (n == 0) {

				uniqueList.add(myList.get(i));
			}
		}

		System.out.println(uniqueList);
	}

	public static void onlyUniques(List<Integer> myList) {
		List<Integer> uniqueList = new ArrayList<Integer>();

		for (int i = 0; i < myList.size(); i++) {

			int n = 0;

			for (int j = 0; j < myList.size(); j++) {

				if (myList.get(i) == myList.get(j)) {

					n++;
				}
			}

			if (n == 1) {
				uniqueList.add(myList.get(i));
			}

		}

		System.out.println(uniqueList);
	}
}
