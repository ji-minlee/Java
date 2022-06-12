package java004;

import java.util.Scanner;

public class P05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("<Guidelines for Password>");
		System.out.println("1. Use at least 8 characters ");
		System.out.println("2. Start with uppercase ");
		System.out.println("3. Use at least one number (0 ~ 9)");
		System.out.println("4. Include at least one of those special character(e.g.!,&,*,@) ");
		System.out.println("5. Do not use the password same as user ID");
		while (true) {
			System.out.println("Input your user ID ->");
			String userId = sc.nextLine();

			System.out.println("Input your password -> ");
			String password = sc.nextLine();
			char start = password.charAt(0);

			if (password.length() >= 8 && Character.isUpperCase(start) == true
					&& (password.contains("0") || password.contains("1") || password.contains("2")
							|| password.contains("3") || password.contains("4") || password.contains("5")
							|| password.contains("6") || password.contains("7") || password.contains("8")
							|| password.contains("9"))
					&& (password.contains("!") || password.contains("&") || password.contains("*")
							|| password.contains("@"))
					&& (password.contains("!") || password.contains("&") || password.contains("*")
							|| password.contains("@"))
					&& (!(userId.equals(password)))) {
				System.out.println("Valid Password\n");

			} else {
				System.out.println("Invalid Password! Please try another one.\n");
			}

		}
	}
}
