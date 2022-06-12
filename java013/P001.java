package java013;

import java.util.Scanner;

public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number");
		int input1 = sc.nextInt();
		
		System.out.println("Please input another number");
		int input2 = sc.nextInt();
		
		int digit1 = 100 - input1;
		int digit2 = 100 - input2;
		
		int firstDigit = digit1 + digit2;
		int firstTwoDigit = 100 - firstDigit;
		
		int lastDigit = digit1 * digit2;
		
		System.out.println("First two digits : 100 - " + firstDigit + " = " + firstTwoDigit );
		System.out.println("Last two digits : " + lastDigit);
		System.out.println("Result : " + firstTwoDigit + lastDigit);
		
	}

}
