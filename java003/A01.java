package java003;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mean = 0, max = 0, min = 0;
		int count = 1;

		while (true) {
			int inputNumber = scanner.nextInt(); // 숫자 입력을 무한히 받는다 > while문 안으로

			if (count == 1) { // 처음 숫자를 입력

				mean = (mean + inputNumber) / 1;
				max = Math.max(inputNumber, inputNumber);
				min = Math.min(inputNumber, inputNumber);

			} else { // 두번째 입력부터는 앞의 결과를 반영한다.
				mean = (mean * (count - 1) + inputNumber) / count;
				max = Math.max(max, inputNumber);
				min = Math.min(min, inputNumber);
			}
			System.out
					.println("Result : " + count + " - " + "Mean " + mean + ", " + "Max " + max + ", " + "Min " + min);
			count++;
		}

	}

}
