package java011;

import java.util.Arrays;
import java.util.Scanner;

public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 영어 문자열을 입력하세요 (대소문자 구분)");
		String text1 = sc.next();
		System.out.println("두 번째 영어 문자열을 입력하세요 (대소문자 구분)");
		String text2 = sc.next();
		
		StringtoChar(text1);
		StringtoChar(text2);
		
		StringCompare(StringtoChar(text1), StringtoChar(text2));
		
	}
	
	public static String StringtoChar(String text) {
		char[] stringtoChar = text.toCharArray();
		Arrays.sort(stringtoChar);
		String sortedString = new String (stringtoChar);
		return sortedString;
	}
	
	public static void StringCompare(String textOne, String textTwo) {
		if (textOne.equals(textTwo)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
