package java002;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int gcd = 1;
		for (int i = 2; i <= number1 && i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
			}
		}
		int lcm = number1 * number2 / gcd;
		System.out.println(lcm);
	}

}
