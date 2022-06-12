package java002;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number do you want?");
		int number = scanner.nextInt();
		int j;

		switch (number) {
		case 2:
			while (number == 2) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 3:
			while (number == 3) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 4:
			while (number == 4) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 5:
			while (number == 5) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 6:
			while (number == 6) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 7:
			while (number == 7) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 8:
			while (number == 8) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		case 9:
			while (number == 9) {
				j = 2;
				while (j <= 9) {
					System.out.println(number + "*" + j + "=" + (number * j));
					j++;
				}
				number++;
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
		}
	}

}
