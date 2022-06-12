package java007;

import java.util.Arrays;
import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		String arrNumbers = Arrays.toString(numbers).replaceAll("[^0-9 ]", "");
		String[] arrNumbersCut = arrNumbers.split(" ");

		System.out.println("Please input a number");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

		for (int i = 0; i < numbers.length; i++) {
			if (arrNumbersCut[i].contains(num)) {
				System.out.print(arrNumbersCut[i] + " ");
			}
		}
	}
}
