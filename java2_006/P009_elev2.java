package java2_006;
// 엘리베이터2 / 20220417 / k32_이지민 /주석은 k32_생략
public class P009_elev2 {
	public int k32_limit_up_floor;		//private(클래스내에서만 사용가능) 정수형 변수 선언, 최상층
	public int k32_limit_down_floor;	//private(클래스내에서만 사용가능) 정수형 변수 선언, 최하층
	public int k32_floor;				//private(클래스내에서만 사용가능) 정수형 변수 선언, 현재층
	public String k32_help;	//private(클래스내에서만 사용가능) 문자열형 변수 선언, 도움말 문자열
	
	P009_elev2() {	//생성자 선언, 기본적인 세팅값을 변수에 입력
		k32_limit_up_floor = 10;	// 최상층 10으로 초기화
		k32_limit_down_floor = 0;	// 최하층 0으로 초기화
		k32_floor = 1;		//현재층 1로 초기화
		k32_help = "엘리베이터 기본 준공완료";	//도움말로 기본 준공완료의 메세지 입력
	}
	
	P009_elev2(int k32_up_floor, int k32_d_floor, int k32_in_floor) {	//생성자 오버로딩, 정수형 변수 3개 받음
		k32_limit_up_floor = k32_up_floor;	//받아온 최상층 정수를 입력
		k32_limit_down_floor = k32_d_floor;	//받아온 최하층 정수를 입력
		k32_floor = k32_in_floor;			//받아온 현재층 정수를 입력
		k32_help = "엘리베이터 맞춤 준공완료";		//맞춤 준공완료로 메세지 입력
	}
	
	void k32_up() {	//층수를 올리는 메소드 선언. 리턴 없음
		if(k32_floor == k32_limit_up_floor) {	//현재층이 최상층이라면 
			k32_help = "마지막 층입니다";	//마지막이라고 메세지 출력
		} else {	//최상층이 아니라면 
			k32_floor++;	//현재층을 1만큼 증가
			k32_help = String.format("[%d] 층입니다.", k32_floor);	//현재층 출력
		}
	}
	
	void k32_down() {	//한층 내리는 메소드 선언. 리턴 없음
		if(k32_floor == k32_limit_down_floor) {	//현재층이 최하층이라면 
			k32_help = "처음 층입니다";	//처음층이라고 메세지 출력
		} else {	//현재층이 최하층이 아니라면 
			k32_floor--;	//현재층을 1만큼 감소 
			k32_help = String.format("[%d] 층입니다.", k32_floor);	//현재층 출력
		}
	}
	
	void k32_up(int k32_u) {	// 정수형 변수를 받아 그수만큼 층을 올리는 함수 선언. 리턴 없음
		//this를 통해 오버로딩 된 메소드를 this를 써서 호출, 층수만큼 k32_up()실행, 결과적으로 k32_u만큼 층 상승
		for(int k32_i = 0; k32_i < k32_u; k32_i++) this.k32_up();
	}
	
	void k32_down(int k32_u) {	// 정수형 변수를 받아 그수만큼 층을 내리는 함수 선언. 리턴 없음
		//this를 통해 오버로딩 된 메소드를 this를 써서 호출, 층수만큼 k32_down()실행, 결과적으로 k32_u만큼 층 하강
		for(int k32_i = 0; k32_i < k32_u; k32_i++) this.k32_down();
	}
	
	void k32_msg(String k32_id) {	// 입력받은 문자열을 출력하면서, 추가로 층수에 대한 정보를 출력하는 메소드
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				k32_id,k32_help,k32_limit_up_floor,k32_limit_down_floor,k32_floor);
	}
	
}
