package java2_004;

public class P010 {
// 숫자 읽기 / 20220415 / k32_이지민 // 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k32_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열인 units를 선언하고 초기화 한다
		for (int k32_i = 0; k32_i < 101; k32_i++) { // 정수형 변수 i가 0부터 100까지 1씩 증가할 때 (for문)
			if (k32_i >= 0 && k32_i < 10) { // i가 0이상 10 미만이면 (if문)
				System.out.printf("일의자리 : %s\n", k32_units[k32_i]); // 배열에서 올바른 숫자 읽기를 찾아 출력
			} else if (k32_i >= 10 && k32_i < 100) { // i가 10이상 100미만 이면 (if문)
				int k32_i10, k32_i0; // 정수형 변수 i10과 i0을 선언
				k32_i10 = k32_i / 10; // i10을 변수 i/10으로 초기화 (십의 자리)
				k32_i0 = k32_i % 10; // i0을 변수 i%10으로 초기화 (일의 자리)
				
				if (k32_i0 == 0) { // i0(일의 자리)가 0이면
					System.out.printf("십의자리 : %s십\n", k32_units[k32_i10]); // 배열에서 i10위치를 출력
				} else { // i0(일의 자리)가 0이 아니면
					System.out.printf("십의자리 : %s십%s\n", k32_units[k32_i10], k32_units[k32_i0]); // 배열에서 i10위치, i0위치를 출력
				}
			} else
				System.out.printf("==> %d\n", k32_i); // i가 위 두 조건식을 만족하지 않으면(100 이상 이면) i를 출력
		}
	}

}
