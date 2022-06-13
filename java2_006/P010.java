package java2_006;
//tv리모콘2 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P010 {
	static P010_TvRemocon2 k32_rmt1;	// 전역에서 클래스를 넣을 이름 선언
	static P010_TvRemocon2 k32_rmt2;	// 전역으로 클래스를 넣을 이름 선언

	public static void main(String[] args) {
		
		k32_rmt1 = new P010_TvRemocon2();	//변수를 받지않는 생성자 메소드 선언
		k32_rmt2 = new P010_TvRemocon2(10, 13);	//정수형 변수 2개를 지정해서 받는 생성자 메소드 선언
		
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// 정수형 변수 i가 0부터 4까지 1씩 증가하면
			k32_rmt1.k32_tvChannelUp(); k32_rmt1.k32_msg();	// 채널을 1만큼 증가하는 메소드 실행 및 메세지 출력 메소드 실행
			//k32_rmt2.k32_tvChannelUp(); k32_rmt2.k32_msg();
		}
		
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// 정수형 변수 i가 0부터 4까지 1씩 증가하면
			k32_rmt1.k32_tvChannelDown(); k32_rmt1.k32_msg();	// 채널을 1만큼 감소하는 메소드 실행 및 메세지 출력 메소드 실행
			//k32_rmt2.k32_ChannelDown(); k32_rmt2.k32_msg();
		}

		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수형 변수 i가 0부터 9까지 1씩 증가하면
			//k32_rmt1.k32_VolUp(); k32_rmt1.k32_msg();
			k32_rmt2.k32_tvVolUp(); k32_rmt2.k32_msg(); //볼륨을 1만큼 증가하는 메소드 실행 및 메세지 출력 메소드 실행
		}

		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수형 변수 i가 0부터 9까지 1씩 증가하면
			//k32_rmt1.k32_VolDown(); k32_rmt1.k32_msg();
			k32_rmt2.k32_tvVolDown(); k32_rmt2.k32_msg();	//볼륨을 1만큼 감소하는 메소드 실행 및 메세지 출력 메소드 실행
		}

	}
}
