package java003;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] strArr = text.split(" ");
		String vowel = "aeiou";
		String consonant = "bcdfghjklmnpqrstvwxyz";

		String[] vowel2 = vowel.split("");
		String[] consonant2 = consonant.split("");

		for (int i = 1; i < strArr.length; i++) {
			for (int j = 1; j < vowel2.length; j++) {
				if (strArr[i].substring(0, 1).contains(vowel2[j])) {
					if (strArr[i - 1].equals("a")) {
						strArr[i - 1] = "an";
					}
				}
			}

			for (int z = 0; z < consonant2.length; z++) {
				if (strArr[i].substring(0, 1).contains(consonant2[z])) {
					if (strArr[i - 1].equals("an")) {
						strArr[i - 1] = "a";
					}
				}
			}
		}
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
}
