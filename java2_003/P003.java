package java2_003;

public class P003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1 4) 정수형 연산(버림), 5) 나머지(%)연산자의 응용,  20220414, k32_이지민, 정수형 버림과 나머지 연산자의 이해

		int k32_ii = 1000 / 3; 		// 변수 설정을 정수 int로 했으므로 소수점 이하가 나오지 않는다
		System.out.printf("#3-1 : %d\n", k32_ii); 	// 1000/3 = 333(정수만 나옴)

		k32_ii = 1000 % 3; 		// 나머지를 계산할 때 %
		System.out.printf("#3-2 : %d\n", k32_ii); 		// 1000/3의 나머지 출력

		for (int k32_i = 0; k32_i < 20; k32_i++) {		 // k32_i가 0부터 19까지 1씩 증가할 때 (for 반복문)
			System.out.printf("#3-3 : %d  ", k32_i); 	 // k32_i 출력

			if ((k32_i + 1) % 5 == 0) { 	// (k32_i+1) > 0부터 19까지의 범위를 1부터 20까지로 수정
											// (k32_i+1) % 5 == 0 > 나머지가 0인 것은 5번 마다 있으므로
				System.out.printf("\n"); 	// 5개씩을 한 줄로 출력
			}
		}
	}

}
