package java2_004;

public class P006 {
// 범위를 주어서 찾기 / 20220415 / k32_이지민 / 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iVal; // 정수형 변수 iVal 선언

		for (int k32_i = 0; k32_i < 300; k32_i++) { // 정수형 변수 i가 0부터 299까지 1씩 증가할 때 (for문)
			k32_iVal = 5 * k32_i; // iVal에 5 * i 대입 (i가 1씩 증가)
			if (k32_iVal >= 0 && k32_iVal < 10)		// iVal이 0 이상 10 미만이면 (if문), &&는 and를 의미
				System.out.printf("일 %d\n", k32_iVal);		// 수행문 출력 > 조건에 해당하는 iVal 출력
			else if (k32_iVal >= 10 && k32_iVal < 100)		// iVal이 10 이상 100 미만이면 (if문)
				System.out.printf("십 %d\n", k32_iVal); 	// 수행문 출력 > 조건에 해당하는 iVal 출력
			else if (k32_iVal >= 100 && k32_iVal < 1000)	// iVal이 100 이상 1000 미만이면 (if문)
				System.out.printf("백 %d\n", k32_iVal);		// 수행문 출력 > 조건에 해당하는 iVal 출력
			else		// 위의 조건들에 해당 되지 않으면
				System.out.printf("천 %d\n", k32_iVal);		// 수행문 출력 > 조건에 해당하지 않는 iVal 출력
		}
	}

}
