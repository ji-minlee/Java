package java2_005;

public class P001 {
//구구단 인쇄(1) / 20220418 / k32_이지민 / 주석은 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 10; k32_i=k32_i+3) {	//정수 변수 i가 1부터 9까지 3씩 증가하며 반복(for문)
			System.out.println("*******************\t*******************\t*******************");	
			System.out.printf("   구구단 %d 단 \t\t    구구단 %d 단 \t     구구단%d단 \n", k32_i, k32_i+1, k32_i+2);	// i를 1씩 증가하며 가로로 출력
			System.out.println("*******************\t*******************\t*******************");
			for (int k32_j =1; k32_j < 10; k32_j++) {	// 정수 변수 j가 1부터 9까지 1씩 증가하며 반복(for문) > 곱하기 뒤의 부분
				for (int k32_t = k32_i; k32_t < 3 + k32_i; k32_t++) {	// 정수 변수 t가 정수 변수 i부터 i+2까지 1씩 증가하며 반복 (for문) > 곱하기 앞의 부분 
				System.out.printf("  %d * %d = %d   \t\t", k32_t, k32_j, k32_t * k32_j);	// 곱하기의 형태에 맞게 출력
				
			}
				System.out.println();	// 줄 바꾸기
		}
	}
	}
}
