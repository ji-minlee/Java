package java005;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		multiple(input, 2);
	}

	public static void multiple(int input, int i) {
		if (i > 9) {
			return;
		} else {
			System.out.println(input + " X " + i + " = " + input * i);
			multiple(input, i + 1);
		}
	}
}
