package java004;

import java.util.Scanner;

public class P03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, multiple = 0;

		System.out.println("Input the number");
		int inputNumber1 = sc.nextInt();
		System.out.println("Input another number");
		int inputNumber2 = sc.nextInt();

		for (int i = 1; i <= inputNumber1; i++) {
			if (i % inputNumber2 == 0) {
				sum += i;
			}
		}
		System.out.print("SUM : " + sum);

		for (int i = 1; i <= inputNumber1; i++) {
			int divine = inputNumber1 / inputNumber2;
			if (i == 1) {
				System.out.print("(" + i * inputNumber2 + ",");
			} else if (i == divine) {
				System.out.print(i * inputNumber2 + ")");
			} else if (1 < i && i < divine) {
				System.out.print(i * inputNumber2 + ",");
			}

		}
	}
}
