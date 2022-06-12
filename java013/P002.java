package java013;

import java.util.Scanner;

public class P002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		String input1 = sc.nextLine();
		
		System.out.println("Please input another number");
		String input2 = sc.nextLine();
		
		int digit1 = 100 - Integer.parseInt(input1);
		int digit2 = 100 - Integer.parseInt(input2);
		
		int firstDigit = digit1 + digit2;
		int firstTwoDigit = 100 - firstDigit;
		
		int lastDigit = digit1 * digit2;
		
		System.out.println("First two digits : 100 - " + firstDigit + " = " + firstTwoDigit );
		System.out.println("Last two digits : " + lastDigit);
		System.out.println("Result : " + firstTwoDigit + lastDigit);
		
	}
}
