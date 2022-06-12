package java009;

import java.util.ArrayList;
import java.util.Scanner;

public class A02 {
	public static void main(String[] args) {
		Compare();
	}
	
	public static void Compare() {
		int count = 0;
		ArrayList<String> wordOne = new ArrayList<String>();
		ArrayList<String> wordTwo = new ArrayList<String>();
		
		System.out.println("Please input a word");
		Scanner sc = new Scanner(System.in);
		String inputOne = sc.nextLine();
		String[] cutOne = inputOne.split("");
		
		System.out.println("Please input another word");
		String inputTwo = sc.nextLine();
		String[] cutTwo = inputTwo.split("");
	
		System.out.println("1 : " + cutOne.length);
		System.out.println("2 : " + cutTwo.length);
		
		for (String listOne : cutOne) {
			if (!wordOne.contains(listOne)) {
				wordOne.add(listOne);
			}
		}
		for (String listTwo : cutTwo) {
			if (!wordTwo.contains(listTwo)) {
				wordTwo.add(listTwo);
			}
		}
		
		for (int i = 0; i < wordOne.size(); i++) {
			for (int j = 0; j < wordTwo.size(); j++) {
				if (wordOne.get(i).equals(wordTwo.get(j))) {
					count++;
				}
			}
		}
		System.out.println("3 : " + count);
	}
}
