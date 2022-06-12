package java009;

import java.util.ArrayList;
import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Descriptive();
	}

	public static void Descriptive() {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum = 0, mean = 0;
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

			System.out.println("Please input a number");
			int inputNum = sc.nextInt();
			numList.add(inputNum);

			for (int i = 0; i < numList.size(); i++) {
				sum += numList.get(i);
				max = Math.max(max, numList.get(i));
				min = Math.min(min, numList.get(i));
			}
			mean = sum / numList.size();
			
			System.out.println("Result : " + numList.size() + " - Mean " + mean + 
					", Max " + max + ", Min " + min);
		}

	}

}
