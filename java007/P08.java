package java007;

import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a text in alphabet");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		for (int i = 0; i < text.length(); i++) {
			int index = 'z' - text.charAt(i);
			System.out.print((char)('a' + index));
		}
	}

}
