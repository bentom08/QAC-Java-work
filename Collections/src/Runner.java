import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		System.out.println(multiplyList(intList()));
	}
	
	public static int[] intArray() {
		int[] intArray = new int[100];
		
		for(int i = 1; i <= 100; i++) {
			intArray[i-1] = i;
		}
		
		return intArray;
	}
	
	public static List<Integer> intList() {
		List<Integer> myList = new ArrayList<>();
		
		for(int i = 100; i <= 999; i++) {
			myList.add(i);
		}
		
		return myList;
	}
	
	public static List<Integer> multiplyList(List<Integer> myList) {
		for(int i = 0; i < myList.size(); i++) {
			myList.set(i, myList.get(i)*10);
		}
		
		return myList;
	}
}