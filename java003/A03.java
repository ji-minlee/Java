package java003;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int cnt[] = new int[26];	// 알파벳은 모두 26개(대문자 only)
			Scanner scan = new Scanner(System.in); 
			String str = scan.nextLine(); // String(문자열)으로 받는다.
			for (int i = 0; i < str.length(); i++) {	
				char ch = str.toUpperCase().charAt(i);	// 문자열의 모든 글자를 대문자로 변환
				if (Character.isLetter(ch))	// ch가 letter인지를 판단하는 함수
					cnt[ch - 'A']++;	// 대문자로 바꾼 알파벳을 cnt[]에 다시 넣음
			}
			for (int i = 0; i < 26; i++) {
				if (cnt[i] > 0) {	// 알파벳이 있는 것만 출력
					System.out.println((char) (65 + i) + " - " + cnt[i]);
				}
			}
	}

}
