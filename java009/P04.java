package java009;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input names");
		Scanner sc = new Scanner(System.in);
		String nameStr = sc.nextLine();
		String[] name = nameStr.split(" ");
		
		System.out.println("Please input scores");
		String scoreStr = sc.nextLine();
		String[] score = scoreStr.split(" ");
		
		Arrays.sort(name);
		System.out.println("Ascending : " + Arrays.toString(name));
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println("Descending : " + Arrays.toString(name));
		
		Arrays.sort(score);
		System.out.println("Ascending : " + Arrays.toString(score));
		Arrays.sort(score, Collections.reverseOrder());
		System.out.println("Descending : " + Arrays.toString(score));
		
	}

}
