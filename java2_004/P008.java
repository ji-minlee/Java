package java2_004;

public class P008 {
// 비정형 비교2, 3 / 20220415 / k32_이지민 / 보기가 쉽지 않다 > 직관적인 코딩의 중요성!/ 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 비정형 비교 2
		for (int k32_i = 1; k32_i < 13; k32_i++) {	 // 정수형 변수 i가 1부터 12까지 1씩 증가할 때 (for문)
			System.out.printf(" %d월 =>", k32_i); 	// 결과 출력 (하나씩 증가하며 출력됨)
			for (int k32_j = 1; k32_j < 32; k32_j++) { 	// 정수형 변수 j가 1부터 31까지 1씩 증가할 때 (for문)
				System.out.printf("%d, ", k32_j); 	// 결과 출력 (하나씩 증가하며 출력됨)

				if (k32_i == 4 || k32_i == 6 || k32_i == 9 || k32_i == 11) {	// 변수 i가 4, 6, 9, 11이면 (if문)
					if (k32_j == 30)	// 변수 j가 30일 때 (if문) 				// ||는 or를 의미(또는)
						break;	// 중단하고 다음으로 넘어감
				}

				if (k32_i == 2) {	// 변수 i가 2이면 (if문)
					if (k32_j == 28)	// 변수 j가 28일 때 (if문)
						break;	// 중단하고 다음으로 넘어감
				}
			}
			System.out.printf("\n");	// 한 줄 띄우기
		}
	
			System.out.println("************************************************"); 	// 구분 위해 한 줄 추가
			
			
	// 비정형 비교 3 / 주석에는 k32_생략
		for (int k32_i = 1; k32_i < 13; k32_i++) {	// 정수형 변수 i가 1부터 12까지 1씩 증가할 때 (for문)
			System.out.printf(" %d월 =>", k32_i);	// 결과 출력 (하나씩 증가하며 출력됨)
			for (int k32_j = 1; k32_j < 32; k32_j++) {	// 정수형 변수 j가 1부터 31까지 1씩 증가할 때 (for문)
				System.out.printf("%d, ", k32_j);	// 결과 출력 (하나씩 증가하며 출력됨)

				if ((k32_i == 4 || k32_i == 6 || k32_i == 9 || k32_i == 11) && (k32_j == 30))
					break;	// 변수 i가 4,6,9,11이면, 변수 j가 30일 때 중단하고 다음으로 넘어감
				if (k32_i == 2 && k32_j == 28)
					break;	// 변수 i가 2이면, 변수 j가 28일 때 중단하고 다음으로 넘어감
			}
			System.out.printf("\n");	// 한 줄 띄우기

		}
	}
}
