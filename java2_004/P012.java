package java2_004;

public class P012 {
// 띄어쓰기 / 20220415 / k32_이지민 / 이론적 연습 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수형 변수 i가 0부터 9까지 1씩 증가할 때 (for문)
			for (int k32_j = 0; k32_j < k32_i; k32_j++) {	// 정수형 변수 j가 0부터 i-1까지 1씩 증가할 때 (for문)
				System.out.printf(" ");		// 수행문 출력 > 빈칸을 출력
			}
			System.out.printf("%d\n", k32_i);	// 수행문 출력 > 변수 i를 1씩 증가하며 출력
		}
	}
}
