package java2_004;

public class P009 {
// case문 비교 / 20220415 / k32_이지민 / 복잡하다. 직관적 코딩의 중요성!/ 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k32_i = 1; k32_i < 13; k32_i++) {	// 정수형 변수 i가 1부터 12까지 1씩 증가할 때 (for문)
			System.out.printf(" %d월 =>", k32_i);	// 결과 출력 (i가 1씩 증가하며 출력됨)
			LOOP: for (int k32_j = 1; k32_j < 32; k32_j++) {	// 정수형 변수 j가 1부터 31까지 1씩 증가할 때 (for문)
				System.out.printf("%d, ", k32_j);	// 결과 출력 (j가 1씩 증가하며 출력됨)
				
				switch (k32_i) {	// 변수 i에 대하여
					case 4: case 6: case 9: case 11:	// 변수 i가 4,6,9,11이면
						if (k32_j == 30) break LOOP;	// 변수 j가 30일 때, 반복문을 중단하고 LOOP로 되돌아간다
						break;	// 반복문을 중단하고 다음으로 넘어간다
					case 2:		// 변수 i가 2이면
						if (k32_j == 28) break LOOP;	// 변수 j가 28일 때, 반복문을 중단하고 LOOP로 되돌아간다
						break;	// 반복문을 중단하고 다음으로 넘어간다
				}
			}
			System.out.printf("\n");	// 한 줄 띄우기
		}
		
		System.out.println("************************************************"); 	// 구분 위해 한 줄 추가
		
		
// Array 이용해 비교 / 20220415 / k32_이지민 / 배열을 활용해보자 / 주석에는 k32_생략
		int[] k32_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	// 각 월의 마지막 날을 배열로 선언

		for (int k32_i = 1; k32_i < 13; k32_i++) {	// 정수형 변수 i가 1부터 12까지 1씩 증가할 때 (for문)
			System.out.printf(" %d월 =>", k32_i);	// 결과 출력 (i가 1씩 증가하며 출력됨)
			for (int k32_j = 1; k32_j < 32; k32_j++) {	// 정수형 변수 j가 1부터 31까지 1씩 증가할 때 (for문)
				System.out.printf("%d", k32_j);		// 결과 출력 (j가 1씩 증가하며 출력됨)

				if (k32_iLMD[k32_i - 1] == k32_j)	// 배열의 i-1번째 위치의 숫자가 변수 j와 같아지면(배열은 0번째부터 시작한다) 
					break;							//  반복문을 중단하고 다음으로 넘어간다(break 아래의 내용은 실행하지 않는다)

				System.out.printf(","); // 마지막 일에는 콤마를 찍지 않는다. (break 다음에 있기 때문)
			}
			System.out.printf("\n");	// 한 줄 띄우기
		}
	}

}
