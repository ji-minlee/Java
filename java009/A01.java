package java009;

import java.util.ArrayList;
import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonc();
	}

	public static void Fibonc() {
		ArrayList<Integer> fibo = new ArrayList<Integer>();
		System.out.println("Please input a number");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();

		fibo.add(0);
		fibo.add(1);
		for (int i = 2; i < inputNum; i++) {
			int fiboNum = fibo.get(i - 1) + fibo.get(i - 2);
			fibo.add(fiboNum);
		}
		System.out.print(fibo + " ");
	}
}
