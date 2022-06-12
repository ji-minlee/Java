package java007;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		System.out.println("Please input a text");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String cutText[] = text.split(" ");
		String cutOneText[] = text.split("");

		System.out.println("Please input a word");
		String word = sc.nextLine();
		String cutWord[] = word.split(" ");
		
		if (word.length() == 1) {
			for (int i = 0; i < cutOneText.length; i++) {
				if ((cutOneText[i].contains(cutWord[0]))) {
					count++;
				}
			}
		} else {
			for (int i = 0; i < cutText.length; i++) {
				if ((cutText[i].contains(cutWord[0]))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
