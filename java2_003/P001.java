package java2_003;

public class P001 {
// #1. 1) 사칙연산, 2) 연산 후 대입, 20220414, k32_이지민, 당연히 사칙연산의 순서
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_ii;	 // int k32_ii로 정수형 변수를 설정한다
		k32_ii = 1 + 2;	 // 변수 k32_ii에 1+2를 대입
		System.out.printf("#1-1 : %d\n", k32_ii); 	// 변수 k32_ii를 출력

		k32_ii = 1 + 2 * 3;		// 변수 k32_ii에 1+2*3을 대입
		System.out.printf("#1-2 : %d\n", k32_ii); 	// 변수 k32_ii를 출력
	}

}
