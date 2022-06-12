package java005;

import java.util.Scanner;

public class P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber = numberInput();
		System.out.println(factorial(inputNumber));

	}

	public static int numberInput() {
		System.out.println("Please input the number");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		return inputNum;
	}

	public static int factorial(int inputNum) {
		if (inputNum == 1) {
			return 1;
		} else {
			return inputNum * factorial(--inputNum);
		}
	}
}
