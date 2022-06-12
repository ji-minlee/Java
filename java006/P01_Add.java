package java006;

import java.util.Scanner;

public class P01_Add {
	int a, b, c, d, n;
	
	public P01_Add(int a, int b, int c, int d) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void printMenu() {
		System.out.println("#Menu");
		System.out.println("1. Apple\n2. Strawberry\n3. Grapes\n4. Watermelon");
	}
	
	public void selectFruit() {
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();
	}
	public void result() {
		if (n == a) {
			System.out.println(a + ". Apple : 1500 won");
		} else if (n == b) {
			System.out.println(b + ". Strawberry : 5000 won");
		} else if (n == c) {
			System.out.println(c + " . Grapes : 7000 won");
		} else if (n == d) {
			System.out.println(d + " . Watermelon : 12000 won");
		}
	}
	
}
