package java002;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int gcd = 0;

		for (int i = 2; i <= number1 && i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
				i++;
			}
		}
		System.out.println(gcd);
	}

}
