package java2_006;
// 클래스, 객체, 인스턴스 / 20220417 / k32_이지민 / 주석에서는 k32_제외
public class P005 {

	private static int k32_inVal;	// private(같은 클래스 내에서만 사용) 등급의 static 정수 변수 선언
	public static void k32_up() {	// public 등급의 static 함수 선언 / 리턴값 없음
		k32_inVal++;	// 변수의 값 1 증가
		System.out.printf("난 그냥 메소드[%d]\n", k32_inVal);	// 결과 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k32_inVal = 0;	// 변수에 0 입력
		P004 k32_elev;	// P004 클래스를 elev로 선언
		
		k32_elev = new P004(); // elev에 P004 클래스 입력
		
		k32_up();	// 위에 선언한 함수 실행
		
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수 변수 i가 0부터 9까지 1씩 증가할 때
			k32_elev.k32_up();	// P004에 있는 up함수 실행
			System.out.printf("MSG[%s]\n", k32_elev.k32_help);	// 결과 출력
		}
		
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수 변수 i가 0부터 9까지 1씩 증가할 때
			k32_elev.k32_down();	// P004에 있는 down함수 실행
			System.out.printf("MSG[%s]\n", k32_elev.k32_help);	// 결과 출력
		
	}
}

	
}
