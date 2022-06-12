package java007;

import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a text");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] cutText = text.split(" ");
		
		for (int i = 0; i < cutText.length; i++) {
			System.out.println(cutText[i]);
		}
	}
}
