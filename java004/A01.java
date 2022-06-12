package java004;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String textLow = text.toLowerCase();
		String textResult = textLow.replaceAll(" ", "");
		int consonant = 0, vowel = 0;
		
		for (int i = 0; i < textResult.length(); i++) {
			if ((textResult.charAt(i) == 'a') || (textResult.charAt(i) == 'e') || (textResult.charAt(i) == 'i')
					|| (textResult.charAt(i) == 'o') || (textResult.charAt(i) == 'u')) {
				vowel++;
			}
			else if ((textResult.charAt(i) != 'a') || (textResult.charAt(i) != 'e') || (textResult.charAt(i) != 'i')
					|| (textResult.charAt(i) != 'o') || (textResult.charAt(i) != 'u')){
				consonant++;
			}
		}
		System.out.println("Consonant : " + consonant);
		System.out.println("Vowel : " + vowel);
	}

}
