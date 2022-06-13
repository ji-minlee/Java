package java2_006;
//tv리모콘3 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P012_TvRemoconX extends P010_TvRemocon2 {
	
	public int k32_battery = 80;
	
	void k32_batteryCheck() {	//P010_TvRemocon를 상속받아 메소드 추가		
		System.out.printf("현재 건전지는 %d%% 남았습니다.\n", k32_battery);	//남은 건전지량을 출력
		k32_battery--;
	}

}
