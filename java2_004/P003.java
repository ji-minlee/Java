package java2_004;

public class P003 {
// 기본 for문과 복합 for문, 20220415, k32_이지민, for문을 익히자 / 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 기본 for문
		int k32_sum = 0;	// 정수형 변수 sum 선언 및 0으로 초기화
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수형 변수 i가 0부터 9까지 1씩 증가할 때
			k32_sum = k32_sum + k32_i;		// 정수형 변수 sum에 변수 i를 누적합
		}
		System.out.printf("sum %d\n", k32_sum);		// 누적합 한 sum을 출력

	// 복합 for문  
		for (int k32_i = 1; k32_i < 10; k32_i++) {		// 정수형 변수 i가 1부터 9까지 1씩 증가할 때
			System.out.printf("************************************\n", k32_i);
			System.out.printf("	  구구단 %d 단\n", k32_i);		// 변수 i가 1부터 9까지 1씩 증가하며 출력
			System.out.printf("************************************\n", k32_i);
			for (int k32_j = 1; k32_j < 10; k32_j++) {		// 정수형 변수 j가 1부터 9까지 1씩 증가할 때
				System.out.printf(" %d * %d = %d \n", k32_i, k32_j, k32_i * k32_j);	// i * j = i * j 의 형태로 출력
			}																		// 구구단 출력
		}
	}

}
