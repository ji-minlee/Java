package java2_006;
// tv리모콘 조작하기 / 20220417 / k32_이지민 / 주석은 k32_제외
public class P006 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		P006_TvRemocon k32_rmc = new P006_TvRemocon();	// P006_TvRemocon 클래스 rmc 선언
		
		// 채널 10번 올리기
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수 변수 i가 0부터 9까지 1씩 증가할 때
			k32_rmc.k32_tvChannelUp();	// rmc의 채널 올리기 함수 실행
		}
		//채널 10번 내리기
		for (int k32_i = 0; k32_i < 10; k32_i++) {	// 정수 변수 i가 0부터 9까지 1씩 증가할 때
			k32_rmc.k32_tvChannelDown();	// rmc의 채널 내리기 함수 실행
		}
		// 볼륨 5번 올리기
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// 정수 변수 i가 0부터 5까지 1씩 증가할 때
			k32_rmc.k32_tvVolUp();	// rmc의 볼륨 올리기 함수 실행
		}
		// 볼륨 5번 내리기
		for (int k32_i = 0; k32_i < 5; k32_i++) {	// 정수 변수 i가 0부터 5까지 1씩 증가할 때
			k32_rmc.k32_tvVolDown();	// rmc의 볼륨 내리기 함수 실행
		}
	}

}
