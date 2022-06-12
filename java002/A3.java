package java002;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scannner = new Scanner(System.in);
		int input = scannner.nextInt();

		for (int i = 1; i <= input; i++) { // make a line
			for (int j = 1; j <= i; j++) { // make a degree
				System.out.print("*");
			}
			System.out.println(); // next line
		}
	}

}
