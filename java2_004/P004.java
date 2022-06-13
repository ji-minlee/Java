package java2_004;

public class P004 {
// for문과 while문의 단순비교, 20220415, k32_이지민, for문 대신 while과 break를 사용, 초기화 및 누적위치 확인! / 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iA, k32_iB;		// 정수형 변수 iA와 iB를 선언

		k32_iA = 0;		// iA를 0으로 초기화

		while (true) {	// while(true)는 무한 반복문(1)
			k32_iB = 0;		// iB를 0으로 초기화
			
			while (true) {	// while(true)는 무한 반복문(2)
				System.out.printf("*");		// iB가 0일 때, * 출력
				
				if (k32_iA == k32_iB)	// iA와 iB가 같으면 (if문)
					break;		// break; > 반복을 멈추고 넘어간다. 이후의 문장은 수행하지 않는다 (while(2) 종료)
				k32_iB++;	// iA와 iB가 같기 전까지는 iB를 1 증가한다. 
			}
			System.out.printf("\n");	// 줄 바꾸기
			k32_iA++;	// iA를 1 증가한다
			if (k32_iA == 30)	// iA가 30이 되면 (if문)
				break;	//반복문을 멈추고 다음으로 넘어간다. > while(1) 종료
		}
	}

}
