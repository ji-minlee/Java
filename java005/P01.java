package java005;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P01 p01 = new P01();
		Scanner sc = new Scanner(System.in);

		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");

		int a = sc.nextInt();

		p01.addition(a);
	}
	
	public void addition(int familyMember) {
		if (familyMember == 1) {
			System.out.println("Mike");
		} else if (familyMember == 2) {
			System.out.println("Rachel");
		} else if (familyMember == 3) {
			System.out.println("John");
		} else if (familyMember == 4) {
			System.out.println("Monica");
		} else {
			System.out.println("Choose another number");
		}
	}

}
