package java2_007;
// 클래스의 배열 / 20220420 / k32_이지민 / 주석에는 k32_생략
public class P006_OneRec {
		//private 이 클래스에서만 사용 가능
		private String k32_name;	// 문자열 변수 학생의 이름 선언
		private int k32_kor;	// 정수 변수 국어 성적 선언
		private int k32_eng;	// 정수 변수 영어 성적 선언
		private int k32_math;	// 정수 변수 수학 성적 선언
		
		public P006_OneRec(String name, int kor, int eng, int math) {	// 생성자 만들기 (변수 4개 > 이름, 국어, 영어, 수학 성적)
			
			this.k32_name = name;	// 위에서 선언한 이름을 생성자로 받아온다
			this.k32_kor = kor;		// 위에서 선언한 국어 점수를 생성자로 받아온다
			this.k32_eng = eng;		// 위에서 선언한 영어 점수를 생성자로 받아온다
			this.k32_math = math;	// 위에서 선언한 수학 점수를 생성자로 받아온다
			
		}
		
		

		
		public String k32_getName() {return this.k32_name;};	// 입력한 이름을 리턴하는 메소드 생성
		public int k32_getKor() {return this.k32_kor;};		// 입력한 국어 성적을 리턴하는 메소드 생성
		public int k32_getEng() {return this.k32_eng;};		// 입력한 영어 성적을 리턴하는 메소드 생성
		public int k32_getMath() {return this.k32_math;};	// 입력한 수학 성적을 리턴하는 메소드 생성
		public int k32_getSum() {return this.k32_kor + this.k32_eng + this.k32_math;};	// 3과목의 합을 구하는 메소드 생성
		public double k32_getAvg() {return this.k32_getSum() / 3.0;};	// 3과목의 평균(실수형)을 구하는 메소드 생성
		
	}

