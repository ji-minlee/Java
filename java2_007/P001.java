package java2_007;

import java.util.Arrays;
//한글 계산 / 20220420 / k32_이지민 / 주석에는 k32_생략 / getBytes().length와 length 활용하기
public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형식에 맞게 출력하기
		System.out.printf("HanBlankForeword[%s]\n", k32_HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", k32_HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k32_HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k32_HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", k32_HanCount("한글한글aa"));
	}

	public static String k32_HanBlankForeword(String k32_str, int k32_number) { // String 메소드 선언
		String k32_strBlank = "";	// blank 문자열을 선언 및 초기화
		for (int k32_i = 0; k32_i < k32_number; k32_i++) {	// number만큼 정수 변수 i가 1씩 증가하며 반복 (for문) > number는 문자열의 총 길이를 의미
			if (k32_i < k32_number - k32_str.getBytes().length) {	// 총 길이에서 str의 바이트의 길이를 뺀 만큼
				k32_strBlank += " ";	// 공백을 추가한다
			}
		}
		return k32_strBlank + k32_str;	// 리턴 값 : 공백 + 주어진 문자열

	}

	public static String k32_HanBlankBackword(String k32_str, int k32_number) {	// String 메소드 선언
		String k32_strBlank = "";	// blank 문자열을 선언 및 초기화
		for (int k32_i = 0; k32_i < k32_number; k32_i++) {	// number만큼 정수 변수 i가 1씩 증가하며 반복 (for문) > number는 문자열의 총 길이를 의미
			if (k32_i < k32_number - k32_str.getBytes().length) {	// 총 길이에서 str의 바이트의 길이를 뺀 만큼
				k32_strBlank += " ";	// 공백을 추가한다
			}
		}
		return k32_str + k32_strBlank;	// 리턴값 : 주어진 문자열 + 공백
	}

	public static int k32_HanCount(String k32_str) {	// 한글의 개수를 세는 int 메소드 선언
		return k32_str.getBytes().length - k32_str.length();	// 리턴값 : 문자열의 바이트의 길이에서 문자열의 길이를 뺀 것 > 한글은 한글자가 2바이트
	}
}
