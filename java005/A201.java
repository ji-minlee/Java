package java005;

import java.util.Scanner;

public class A201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0, mean, median;
		System.out.println("Please input the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = input; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= input; i++) {
			sum += i;
		}
		
		mean = sum / input;
		
		if(input % 2 == 0) {
			median = (float) (input + 1) / 2;
		} else {
			median = input/2 +1;
		}
		
		
		System.out.println("Mean : " + mean + ", Median : " + median);
	}
}
