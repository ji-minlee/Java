package java006;

import java.util.Scanner;

public class A201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number ->");
		int input = sc.nextInt();
		double sum = 0;

		for (int i = input; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= input; i++) {
			sum += i;
		}

		double avg = sum / input;
		double sumDis = 0;

		for (int i = 1; i <= input; i++) {
			sumDis += Math.pow((i - avg), 2);
		}

		double var = sumDis / input;

		double std = Math.sqrt(var);

		System.out.println(std);

	}
}
