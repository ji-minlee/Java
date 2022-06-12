package java008;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a string");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		char[] characters = text.toCharArray();

		if (characters.length % 2 == 0) {
			System.out.print(characters[characters.length / 2 - 1]);
			System.out.print(characters[characters.length / 2]);
		} else {
			System.out.println(characters[characters.length / 2]);
		}
	}

}
