package java2_004;

public class P005 {
// 숫자형, 문자형 비교 / 20220415 / k32_이지민 / 숫자는 정수형, 실수형 주의, String은 .equal()로 비교 / 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 숫자형 비교
		int k32_il; 	// 정수형 변수 il 선언
		double k32_iD;	// 실수형 변수 iD 선언

		k32_il = 10 / 3;	// il을 10 / 3으로 초기화 > 정수형이므로 3
		k32_iD = 10 / 3.0;	// iD를 10 / 3.0으로 초기화 > 실수형이므로 3.3333

		if (k32_il == k32_iD) System.out.printf("equal\n");  // int와 double은 정수형 연산과 실수형 연산이다
		else System.out.printf("Not equal [%f][%f]\n", (double) k32_il, k32_iD); // 따라서 두 변수는 다르다

		if (k32_iD == 3.333333)	System.out.printf("equal\n");	// 단지 유효숫자까지 표시된 것 뿐이지 다르다
		else System.out.printf("Not equal [3.333333][%f]\n", k32_iD);	// not equal이 출력된다

		k32_iD = (int) k32_iD;	// 실수형 변수 iD를 정수형으로 변환 
		if (k32_il == k32_iD) System.out.printf("equal\n");		// 정수형으로 변환했으므로 il과 iD가 같다
		else System.out.printf("Not equal [%f][%f]\n", (double) k32_il, k32_iD); // 다른 경우 출력

		System.out.printf("int로 인쇄 [%d][%f]\n", k32_il, k32_iD);	// int형태 (정수형)으로 인쇄
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) k32_il, k32_iD); // double형태 (실수형)으로 인쇄

		
	// 문자형 비교 / 주석에는 k32_를 생략
		char k32_a = 'c';	// 문자형 변수 a를 'c'로 선언

		if (k32_a == 'b')	// 변수 a가 'b'이면 (if문)
			System.out.printf("a는 b이다\n");	// a는 b이다 출력
		if (k32_a == 'c')	// 변수 a가 'c'이면 (if문)
			System.out.printf("a는 c이다\n");	// a는 c이다 출력
		if (k32_a == 'd')	// 변수 a가 'd'이면 (if문)
			System.out.printf("a는 d이다\n");	// // a는 d이다 출력

		String k32_aa = "abcd";		// 문자열 변수 aa를 "abcd"로 선언

		if (k32_aa.equals("abcd"))	// 변수 aa가 "abcd"이면 (if문)
			System.out.printf("aa는 abcd이다\n");	// 수행 문장 출력
		else	// 변수 aa가 "abcd"가 아니면
			System.out.printf("aa는 abcd이 아니다\n");	// 수행 문장 출력

		boolean k32_bb = true;		// 참, 거짓 변수 bb를 true로 선언

		if (!!k32_bb)	// 변수 bb를 이중부정하면 (if문) > !는 부정(아니다)
			System.out.printf("bb가 아니고 아니면 참이다\n");	// 수행문장 출력
		else	// 조건식에 맞지 않는 경우
			System.out.printf("bb가 아니고 아니면 거짓이다\n");		// 수행 문장 출력
	}

}
