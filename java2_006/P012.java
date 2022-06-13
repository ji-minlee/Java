package java2_006;
//tv리모콘3 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P012 {
	
	public static void main(String[] args) {
		
		P012_TvRemoconX k32_rmt3 = new P012_TvRemoconX();	//P012_TvRemoconX 클래스를 rmt3으로 호출

		k32_rmt3.k32_batteryCheck();	// 상속받아 추가한 함수 실행

		for (int k32_i = 0; k32_i < 5; k32_i++) {	// 정수형 변수 i가 0부터 4가지 1씩 증가할 대
			k32_rmt3.k32_tvChannelUp();	// 채널을 올리는 함수 실행
			k32_rmt3.k32_msg();		// 현재 채널을 알려주는 함수 실행
		}

		k32_rmt3.k32_batteryCheck(); // 상속받아 추가한 함수 실행
	}
}
