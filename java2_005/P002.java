package java2_005;

public class P002 {
//구구단 인쇄(2) / 20220418 / k32_이지민 / 주석은 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 4; k32_i++) {	// 정수 변수 i가 1부터 3까지 1씩 증가하며 반복(for문), 세로로 출력하기 때문
			System.out.println("*******************\t*******************\t*******************");
			System.out.printf("   구구단 %d 단 \t\t    구구단 %d 단 \t     구구단%d단 \n", k32_i, k32_i+3, k32_i+6);	// 가로로는 3씩 추가해 출력
			System.out.println("*******************\t*******************\t*******************");
			for (int k32_j =1; k32_j < 10; k32_j++) {	// 정수 변수 j가 1부터 9까지 1씩 증가하며 반복 (for문) > 곱하기 뒷부분
				for (int k32_t = k32_i; k32_t < 10 + k32_i; k32_t=k32_t+3) {	// 정수 변수 t가 1부터 i+9까지 t+3씩 증가하며 반복 (for문) > 곱하기 앞부분 
				System.out.printf("  %d * %d = %d   \t\t", k32_t, k32_j, k32_t * k32_j);	// 곱하기 형식에 맞게 출력
				
			}
				System.out.println();	// 줄 바꾸기
		}
	}
	}

}
