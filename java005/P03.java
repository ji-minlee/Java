package java005;

import java.util.Scanner;

public class P03 {

	public static final String fatherName = "Mike";
	public static final String motherName = "Rachel";
	public static final String sonName = "John";
	public static final String daughterName = "Monica";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");

		int chooseNum = sc.nextInt();

		printName(chooseNum);
	}

	public static void printName(int personsName) {
		if (personsName == 1) {
			System.out.println(fatherName);
		} else if (personsName == 2) {
			System.out.println(motherName);
		} else if (personsName == 3) {
			System.out.println(sonName);
		} else if (personsName == 4) {
			System.out.println(daughterName);
		} else {
			System.out.println("Select another number");
		}
	}
}
