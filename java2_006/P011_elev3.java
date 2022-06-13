package java2_006;
// 상속으로 클래스 만들기 / 20220417 / k32_이지민 / 주석에는 k32_생략 / public으로 선언된 것은 다 사용 가능
public class P011_elev3 extends P009_elev2 {

	void k32_Repair() {	// Repair 메소드 선언
		k32_help = String.format("수리중입니다");	// "수리 중입니다" 출력
	}
	
	void k32_up() {	// 어버이 클래스를 상속받아 재정의
		if(k32_floor >= k32_limit_up_floor) {	//아버지 클래스의 k32_up 재구현
			k32_help = "마지막층입니다.";
		} else {
			k32_floor = k32_floor + 2;	//최상층이 아닐 때 2층씩 올라감
			k32_help = String.format("%d층입니다.", k32_floor);
		}
		
		this.k32_down();	//아래 k32_down()을 실행하므로 1층 내리고 printf에 설정해둔 메세지가 출력된다.
		//최종적으로 2층 올리가고 1층 내려가면서 메세지 출력하는 메소드
	}
	
	void k32_down() {
		super.k32_down();	//아버지 클래스의 down을 가져와 실행(super), 위에 k32_up처럼 직접 칠 필요없음
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n",this.k32_help);	//클래스 안에서 메세지 출력하는걸 확dls
		//this.k32_down(); 주의! 재귀호출시 뺑뺑이
	}
}
