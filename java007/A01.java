package java007;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a sentence");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String cutLine[] = line.split("");
		System.out.println("Please input a character");
		String alphabet = sc.nextLine();

		for (int i = 0; i < cutLine.length; i++) {
			if (cutLine[i].equals(alphabet)) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
