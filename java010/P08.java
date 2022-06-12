package java010;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Please input a number");
			Scanner sc = new Scanner(System.in);
			int inputNum = sc.nextInt();
			int[] numbers = new int[inputNum];

			System.out.println("Please input a series of numbers");
			String seriesNum = sc.nextLine();
			String[] series = seriesNum.split(" ");

			try {
				for (int i = 0; i < series.length; i++) {
					numbers[i] = Integer.parseInt(series[i]);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error");
			}

			Arrays.sort(numbers);
			for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		}
	}
}
