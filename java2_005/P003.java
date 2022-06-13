package java2_005;

public class P003 {
// 달력 인쇄 / 20220418 / k32_이지민 / 주석은 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iWeekday = 5;	// 주어진 가정 : 1월 1일은 금요일
		int[] k32_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	// 각 월의 마지막 날을 배열로 선언 후 초기화, 주어진 가정 : 올해는 윤년

		for (int k32_iMon = 0; k32_iMon < 12; k32_iMon++) {	// 정수 변수 iMon가 0부터 11까지 1씩 증가하며 반복 (for문), 각 월의 마지막 날을 배열로 지정 > 0부터 시작
			System.out.printf("\n\t         %d월\t\n", k32_iMon+1);	// 수행문 출력(iMon + 1)
			System.out.println("========================================");
			System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "일", "월", "화", "수", "목", "금", "토");	// 요일 출력
			// 빈칸만들기
			for (int k32_index = 0; k32_index < k32_iWeekday; k32_index++) {	// 정수 변수 index가 0부터 iWeekday-1까지 1씩 증가하며 반복 (for문)
				System.out.printf("%5s","");	//5s만큼 띄어쓰기(빈칸 만들기)
			}

			for (int k32_i = 1; k32_i <= k32_iEnd[k32_iMon]; k32_i++, k32_iWeekday++) {	// 정수 변수 i가 1부터 해당 달(i)의 마지막 날까지 1씩 증가하며 반복(for문), iWeekday도 1씩 증가
				if (k32_iWeekday % 7 == 6) {	//iWeekday를 7로 나눈 나머지가 6일 때 (if문) 
					System.out.printf("%5d\n", k32_i);	// 변수 i 출력 후 줄 바꿈, 일~토 (0~6)
					k32_iWeekday = k32_iWeekday - 7;	// iWeekday를 -7 >  0으로 만든다
				} else {	// iWeekday를 7로 나눈 나머지가 6이 아닐 때(if문)
					System.out.printf("%5d", k32_i);	// 변수 i 출력
				}
			}

		}
	}
}
