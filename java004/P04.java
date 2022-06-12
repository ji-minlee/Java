package java004;

import java.util.Scanner;

public class P04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Encryption");
			System.out.println("2. Decryption");
			System.out.println("Choose the option");
			int option = sc.nextInt();

			sc.nextLine();
			System.out.println("Please enter the content");
			String text = sc.nextLine();
			String textLow = text.toLowerCase();

			if (option == 1) {
				String code = textLow.replace("a", "11.").replace("b", "12.").replace("c", "13.").replace("d", "14.")
						.replace("e", "15.").replace("f", "21.").replace("g", "22.").replace("h", "23.")
						.replace("i", "24.").replace("j", "25.").replace("k", "131.").replace("l", "31.")
						.replace("m", "32.").replace("n", "33.").replace("o", "34.").replace("p", "35.")
						.replace("q", "41.").replace("r", "42.").replace("s", "43.").replace("t", "44.")
						.replace("u", "45.").replace("v", "51.").replace("w", "52.").replace("x", "53.")
						.replace("y", "54.").replace("z", "55.");
				System.out.println(code);
			} else {
				String decode = textLow.replace("11.", "a").replace("12.", "b").replace("13.", "c").replace("14.", "d")
						.replace("15.", "e").replace("21.", "f").replace("22.", "g").replace("23.", "h")
						.replace("24.", "i").replace("25.", "j").replace("131.", "k").replace("31.", "l")
						.replace("32.", "m").replace("33.", "n").replace("34.", "o").replace("35.", "p")
						.replace("41.", "q").replace("42.", "r").replace("43.", "s").replace("44.", "t")
						.replace("45.", "u").replace("51.", "v").replace("52.", "w").replace("53.", "x")
						.replace("54.", "y").replace("55.", "z");
				System.out.println(decode);
			}

		}
	}
}
