package java2_006;
//tv리모콘2 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P010_TvRemocon2 {
	private int k32_tvVol;		//private(클래스내에서만 사용가능) 정수 변수 tv볼륨 선언 
	private int k32_tvChannel;	//private(클래스내에서만 사용가능) 정수 변수 tv채널 선언
	
	P010_TvRemocon2() {	//생성자 선언
		k32_tvVol = 45;	// 현재 볼륨
		k32_tvChannel = 7;	//현재 채널
	}
	
	P010_TvRemocon2(int k32_currentVol, int k32_currentChannel) { //생성자 선언, 정수형 변수 2개 받음 , 오버로딩
		k32_tvVol = k32_currentVol;	//현재 볼륨
		k32_tvChannel = k32_currentChannel;	//현재 채널
	}
	
	void k32_tvVolUp() {	// tv 볼륨 증가 함수 선언 (리턴값 없음)
		k32_tvVol++;	// tv 볼륨 증가
		System.out.printf("볼륨 증가 ");	// 결과 출력
	}
	
	void k32_tvVolDown() {	// tv 볼륨 감소 함수 선언 (리턴값 없음)
		k32_tvVol--;	// tv 볼륨 감소
		System.out.printf("볼륨 감소 ");	// 결과 출력
	}
	
	void k32_tvChannelUp() {	// tv 채널 증가 함수 선언 (리턴값 없음)
		k32_tvChannel++;	// tv 볼륨 증가
		System.out.printf("채널 증가 ");	// 결과 출력
	}

	void k32_tvChannelDown() {	// tv 채널 감소 함수 선언 (리턴값 없음)
		k32_tvChannel--; 	// tv 볼륨 감소
		System.out.printf("채널 감소 ");	// 결과 출력
	}
	
	void k32_msg() {	//현재 채널과 볼륨 출력
		System.out.printf("현재 채널 [%d], 현재 볼륨 [%d]\n", k32_tvChannel, k32_tvVol);
	}

}
