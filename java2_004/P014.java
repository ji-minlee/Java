package java2_004;

public class P014 {
// 피라미드 찍기 / 20220415 / k32_이지민 / 규칙을 찾는 습관 들이기/ 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_n, k32_m;	// 정수형 변수 n, m을 선언
		
		k32_m = 20; 	// 변수 m을 20으로 초기화
		k32_n = 1;		// 변수 n을 1로 초기화
		
		while (true) {	// 무한 반복문 
			for (int k32_i = 0; k32_i < k32_m; k32_i++) {	// 정수형 변수 i가 0부터 m-1까지 1씩 증가할 때 (for문)
				System.out.printf(" ");		// 수행문 출력 > 빈칸 출력
			}
			for (int k32_i = 0; k32_i < k32_n; k32_i++) {	// 정수형 변수 i가 0부터 n까지 1씩 증가할 때 (for문)
				System.out.printf("*");		// 수행문 출력 > 별 출력
			}
			System.out.printf("\n");	// 한 줄 띄우기
			
			k32_m = k32_m - 1;		// 변수 m에 m-1 대입
			k32_n = k32_n + 2;		// 변수 n에 n+2 대입
			
			if (k32_m < 0) break;	// 변수 m이 0보다 작으면 반복문에서 나간다. > 종료
		}
	}
}
