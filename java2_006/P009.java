package java2_006;
//엘리베이터2 / 20220417 / k32_이지민 /주석은 k32_생략
public class P009 {
	// P009_elev2 클래스를 각각 k32_elev 1, 2, 3의 이름으로 여러번 호출(서로 독립적)
	static P009_elev2 k32_elev1;
	static P009_elev2 k32_elev2;
	static P009_elev2 k32_elev3;
	
	public static void main(String[] args) {
		k32_elev1 = new P009_elev2(); // elev1은 매개변수가 없는 자신을 호출
		k32_elev2 = new P009_elev2(20, 1, 8); // elev2는 최고 20층, 최저 1층, 현재 8층으로 세팅
		k32_elev3 = new P009_elev2(50, -3, 5); // elev3는 최고 50층, 최저 지하3층, 현재 5층으로 세팅


		for (int k32_i = 0; k32_i < 20; k32_i++) {	// 정수형 변수가 0부터 19까지 1씩 증가할 동안
			k32_elev1.k32_up();		// 엘레베이터 상승 메소드 실행
			k32_elev1.k32_msg("1번 엘레베이터 한층 오르기");
			//k32_elev2.k32_up(); k32_elev2.k32_msg("2번 엘레베이터 한층 오르기");
			//k32_elev3.k32_up(); k32_elev3.k32_msg("3번 엘레베이터 한층 오르기");
		}
		
		for (int k32_i = 0; k32_i < 20; k32_i++) {	// 정수형 변수가 0부터 19까지 1씩 증가할 동안
			//k32_elev1.k32_up(2); k32_elev1.k32_msg("1번 엘레베이터 2층 오르기");
			//k32_elev2.k32_up(2); k32_elev2.k32_msg("2번 엘레베이터 2층 오르기");
			k32_elev3.k32_up(2);	// 층수를 n층만큼 올라가는 메소드를 호출해서 2를 입력 (2만큼 상승)
			k32_elev3.k32_msg("3번 엘레베이터 2층 오르기");
		}

		for (int k32_i = 0; k32_i < 20; k32_i++) {	// 정수형 변수가 0부터 19까지 1씩 증가할 동안
			//k32_elev1.k32_down(3); k32_elev1.k32_msg("1번 엘레베이터 3층 내리기");
			k32_elev2.k32_down(3);	// 층수를 n층만큼 내려가는 메소드를 호출해서 3을 입력 (3만큼 하강)
			k32_elev2.k32_msg("2번 엘레베이터 3층 내리기");
			//k32_elev3.k32_down(3); k32_elev3.k32_msg("3번 엘레베이터 3층 내리기");
		}

	}

}
