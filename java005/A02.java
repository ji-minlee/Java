package java005;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Combination : C(n,r) = n! / r!(n-r)!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input number for 'n'");
		int n = sc.nextInt();

		System.out.println("Please input number for 'r'");
		int r = sc.nextInt();

		int nr = n - r;

		int N = factorial(n);
		int R = factorial(r);
		int NR = factorial(nr);

		int result = N / R / NR;
		
		System.out.print("C(" + n + "," + r + ") = " + n + "! / (" + n + "-" + r + ")! / "
				+ r + "! = (");
		for (int i = n; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ") / (");
			} else {
				System.out.print(i + " X ");
			}
		}
		for (int i = nr; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ") / (");
			} else {
				System.out.print(i + " X ");
			}
		}

		for (int i = r; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ")");
			} else {
				System.out.print(i + " X ");
			}
		}
		System.out.print(" = " + N + " / " + NR + " / " + R + " = " + result);

	}

	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(--number);
		}
	}
}	