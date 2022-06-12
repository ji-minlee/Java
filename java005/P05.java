package java005;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P05 p05 = new P05();

		System.out.println("Please input the number greater than or equal to 2");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		p05.times(number);

	}
	
	public void times(int number) {
		if (number == 0 || number == 1) {
			System.out.println("Please input the number greater than or equal to 2");
		} else {
			for (int i = 2; i < 10; i++) {
				int result = number * i;
				System.out.println(number + " * " + i + " = " + result);
			}
		}
	}
}
