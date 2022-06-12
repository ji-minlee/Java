package java009;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		System.out.println("Please input a series of numbers");
		Scanner sc = new Scanner(System.in);
		String series = sc.nextLine();
		String[] numArr = series.split(" ");

		Stack<String> numbers = new Stack<String>();
		for (int i = 0; i < numArr.length; i++) {
			numbers.add((numArr[i]));
		}
		System.out.println(numbers);

		System.out.println("Please input a number from the series of numbers");
		String inputNum = sc.nextLine();

		if (numbers.contains(inputNum)) {
			System.out.println(numbers.search(inputNum));
		}
		if (count == 0) {
			System.out.println("Cannot find the number");
		}
	}
}
