package java2_006;
//메소드 오버로딩 / 20220417 / k32_이지민 /주석은 k32_제외
public class P008_scoreSumAvg {
	// 3개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언
	public double k32_avg(int k32_a, int k32_b, int k32_c) {	
		return (k32_a + k32_b + k32_c) / 3.0;	// 더블형 리턴
	}

	//4개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언
	public double k32_avg(int k32_a, int k32_b, int k32_c, int k32_d) {	
		return (k32_a + k32_b + k32_c + k32_d) / 4.0;	//더블형 리턴
	}

	//5개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언
	public double k32_avg(int k32_a, int k32_b, int k32_c, int k32_d, int k32_e) {
		return (k32_a+ k32_b + k32_c + k32_d + k32_e)/5.0;	//더블형 리턴
	}
	
	//3개의 정수형 매개변수를 받아 합을 구하는 메소드 선언
	public int k32_sum(int k32_a, int k32_b, int k32_c) {	//정수형 리턴	
		return (k32_a + k32_b + k32_c) ;
	}

	// 4개의 정수형 매개변수를 받아 합을 구하는 메소드 선언
	public int k32_sum(int k32_a, int k32_b, int k32_c, int k32_d) {
		return (k32_a + k32_b + k32_c + k32_d) ;	//정수형 리턴
	}

	// 5개의 정수형 매개변수를 받아 합을 구하는 메소드 선언
	public int k32_sum(int k32_a, int k32_b, int k32_c, int k32_d, int k32_e) {
		return (k32_a+ k32_b + k32_c + k32_d + k32_e);	//정수형 리턴
	}
}
