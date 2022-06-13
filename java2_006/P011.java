package java2_006;
//엘레베이터3 / 20220417 / k32_이지민 / 주석에는 k32_생략 / public으로 선언된 것은 다 사용 가능
public class P011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P011_elev3 k32_elev3;	//P011_elev3 클래스를 호출
		
		k32_elev3 = new P011_elev3();	//P011_elev3 클래스를 elev3로 호출
		
		for(int k32_i = 0; k32_i < 10; k32_i++) {	//정수형 변수가 0부터 9까지 1씩 증가하는 동안
			k32_elev3.k32_up();	// elev3클래스의 up 메소드 실행
			System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// 결과 출력
		}
		
		for(int k32_i = 0; k32_i < 10; k32_i++) {	//정수형 변수가 0부터 9까지 1씩 증가하는 동안
			k32_elev3.k32_down();	// elev3클래스의 down 메소드 실행
			System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// 결과 출력
		}
		
		// extends(상속) 받아서 사용한 함수의 값이 적용되어 출력된다.
		k32_elev3.k32_Repair();	//수리중 메세지 입력 메소드 실행
		System.out.printf("MSG k32_elev3[%s]\n",k32_elev3.k32_help);	// 입력된 메세지 결과 출력
	}

}
