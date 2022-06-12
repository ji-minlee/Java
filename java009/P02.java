package java009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Please input a series of numbers");
		Scanner sc = new Scanner(System.in);
		String series = sc.nextLine();
		String[] numArr = series.split(" ");

		Queue<Integer> numbers = new LinkedList<Integer>();
		for (int i = 0; i < numArr.length; i++) {
			numbers.offer(Integer.parseInt(numArr[i]));
		}
		System.out.println(numbers);

		System.out.println("Please input a number from the series of numbers");
		int inputNum = sc.nextInt();

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.poll() == inputNum) {
				System.out.println((i + 1));
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Cannot find the number");
		}
	}
}
