package java009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a text");
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();

		List<String> textList = Arrays.asList(inputText.split(" "));
		System.out.println(textList);

		Collections.reverse(textList);
		System.out.println(textList);

	}
}
