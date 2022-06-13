package java2_004;

public class P007 {
// 비정형 비교 (깔끔 코딩) / 20220415 / k32_이지민 / 누구나 알아볼 수 있도록 코딩해야 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 13; k32_i++) {		// 정수형 변수 i가 1부터 12까지 1씩 증가할 때 (for문)
			System.out.printf(" %d월 =>", k32_i);	// 결과 출력 (하나씩 증가하며 출력됨)
			for (int k32_j = 1; k32_j < 32; k32_j++) {	// 정수형 변수 j가 1부터 31까지 1씩 증가할 때 (for문)
				System.out.printf("%d, ", k32_j);	// 결과 출력 (하나씩 증가하며 출력됨)
				
				if (k32_i == 1 && k32_j == 31) break;	// i가 1이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 2 && k32_j == 28) break;	// i가 2이고, j가 28이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 3 && k32_j == 31) break;	// i가 3이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 4 && k32_j == 30) break;	// i가 4이고, j가 30이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 5 && k32_j == 31) break;	// i가 5이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 6 && k32_j == 30) break;	// i가 6이고, j가 30이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 7 && k32_j == 31) break;	// i가 7이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 8 && k32_j == 31) break;	// i가 8이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 9 && k32_j == 30) break;	// i가 9이고, j가 30이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 10 && k32_j == 31) break;	// i가 10이고, j가 31이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 11 && k32_j == 30) break;	// i가 11이고, j가 30이면 break(중단하고 다음으로 넘어감)
				if (k32_i == 12 && k32_j == 31) break;	// i가 12이고, j가 31이면 break(중단하고 다음으로 넘어감)				
			}
			System.out.printf("\n");	// 한줄 띄우기
		}
	}

}
