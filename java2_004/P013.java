package java2_004;

public class P013 {
// sin 함수 그래프 / 20220415 / k32_이지민 / 삼각함수 그래프 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k32_fSin;	// 실수형 변수 fSin을 선언
		
		for (int k32_i = 0; k32_i < 360; k32_i++) {		// 정수형 변수 i가 0부터 359까지 1씩 증가할 때 (for문)
			k32_fSin = Math.sin( k32_i * 3.141592 / 180);	// fSin에 i * 라디안값 대입 (1라디안 = 180 / 파이)
			System.out.printf("%d sin ==>%f\n", k32_i, k32_fSin);	// 라디안 값 출력(360도까지 값을 파악)
		}
		
		for (int k32_i = 0; k32_i <360; k32_i++) {	// 정수형 변수 i가 0부터 359까지 1씩 증가할 때 (for문)
			k32_fSin = Math.sin(k32_i * 3.141592 / 180);	// fSin에 i * 라디안값 대입 (1라디안 = 180 / 파이)
			
			int k32_iSpace = (int) ((1.0 - k32_fSin) * 50); // 정수형 변수 iSpace 선언 및 초기화 
			// sin함수는 -1에서 1까지 값이 나온다 이를 양수화 하고 50을 곱하여 0 ~ 100까지 나오게 만든다
			for (int k32_j = 0; k32_j < k32_iSpace; k32_j++) {	// 정수형 변수 j가 0부터 iSpace-1(99)까지 1씩 증가할 때 (for문)
				System.out.printf(" ");		// 수행문 출력 > 빈칸 출력
			}
			System.out.printf("*[%f][%d]\n", k32_fSin, k32_iSpace);	//수행문 출력 > 사인 그래프가 출력된다
		}
	}

}
