package java008;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input set of numbers");
		Scanner sc = new Scanner(System.in);
		String setOne = sc.nextLine();
		String[] arrOne = setOne.split(" ");

		System.out.println("Please input another set of numbers");
		String setTwo = sc.nextLine();
		String[] arrTwo = setTwo.split(" ");

		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (Float.parseFloat(arrOne[i]) == Float.parseFloat(arrTwo[j])) {
					System.out.print(Float.parseFloat(arrOne[i]) + " ");
				}
			}
		}
	}
}
