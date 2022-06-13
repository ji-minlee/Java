package java2_006;
// tv리모콘 클래스 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P006_TvRemocon {

	int k32_tvVol = 1;		//정수 변수 tv볼륨 선언 및 1로 초기화
	int k32_tvChannel = 1;	//정수 변수 tv채널 선언 및 1로 초기화
	
	
	void k32_tvVolUp() {	// tv 볼륨 증가 함수 선언 (리턴값 없음)
		k32_tvVol++;	// tv 볼륨 증가
		System.out.printf("볼륨 증가 -> 현재 볼륨 [%d]입니다\n", k32_tvVol);	// 결과 출력
	}
	
	void k32_tvVolDown() {	// tv 볼륨 감소 함수 선언 (리턴값 없음)
		k32_tvVol--;	// tv 볼륨 감소
		System.out.printf("볼륨 감소 -> 현재 볼륨 [%d]입니다\n", k32_tvVol);	// 결과 출력
	}
	
	void k32_tvChannelUp() {	// tv 채널 증가 함수 선언 (리턴값 없음)
		k32_tvChannel++;	// tv 볼륨 증가
		System.out.printf("채널 증가 -> 현재 채널 [%d]입니다\n", k32_tvChannel);	// 결과 출력
	}

	void k32_tvChannelDown() {	// tv 채널 감소 함수 선언 (리턴값 없음)
		k32_tvChannel--; 	// tv 볼륨 감소
		System.out.printf("채널 감소 -> 현재 채널 [%d]입니다\n", k32_tvChannel);	// 결과 출력
	}
}
