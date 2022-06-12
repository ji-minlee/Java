package java002;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputnumber = scan.nextInt();

		for (int i = 0; i < inputnumber; i++) { // make a line
			for (int j = 0; j < inputnumber - i; j++) { // make a blank
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i + 1); k++) { // make a degree with star
				System.out.print("*");
			}
			System.out.println(""); // change line
		}

	}

}
