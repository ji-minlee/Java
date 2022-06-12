package java002;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("What operation do you want?\n");
		System.out.println("1. +\n");
		System.out.println("2. -\n");
		System.out.println("3. *\n");
		System.out.println("4. /\n");
		System.out.println("--->");

		int operation = scan.nextInt();
		int inputnumber1 = scan.nextInt();
		int inputnumber2 = scan.nextInt();

		if (operation == 1) {
			System.out.println(inputnumber1 + inputnumber2);
		} else if (operation == 2) {
			System.out.println(inputnumber1 - inputnumber2);
		} else if (operation == 3) {
			System.out.println(inputnumber1 * inputnumber2);
		} else if (operation == 4 && inputnumber2 != 0) {
			System.out.println(inputnumber1 / inputnumber2);
		} else {
			System.out.println("Error!");
		}

	}

}
