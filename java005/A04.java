package java005;

import java.util.Scanner;

public class A04 {
	public static void main(String[] args) {
		System.out.println("Please input the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
}
