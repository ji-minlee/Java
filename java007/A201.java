package java007;

import java.util.Scanner;

public class A201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input two numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + " , " + j);
			}

		}

	}

}
