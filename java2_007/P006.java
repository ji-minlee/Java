package java2_007;

public class P006 {
// 클래스의 배열 / 20220420 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 5;	// 정수형 변수로 학생 수 선언 및 5로 초기화
		
		P006_OneRec [] k32_inData = new P006_OneRec[k32_iPerson];	// 클래스 배열 생성 , 크기는 학생 수로
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// 학생 수 만큼 1씩 증가하며 반복 (for문)
			String k32_name = String.format("이지%02d", k32_i);	//문자열 이름생성 (이지 + 넘버 형태)
			int k32_kor = (int)(Math.random() * 100);	// 국어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_eng = (int)(Math.random() * 100);	// 영어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_math = (int)(Math.random() * 100);	// 수학점수 만들기, 실수형 > 정수형으로 형변환
			
			k32_inData[k32_i] = new P006_OneRec(k32_name, k32_kor, k32_eng, k32_math);	//위에서 생성한 값들을 받는 다른 메소드로 보냄
			
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",	// 결과를 형태에 맞추어 출력
					k32_i, k32_inData[k32_i].k32_getName(), k32_inData[k32_i].k32_getKor(), k32_inData[k32_i].k32_getEng(),
					k32_inData[k32_i].k32_getMath(), k32_inData[k32_i].k32_getSum(), k32_inData[k32_i].k32_getAvg());
		}
		
	
	}

}
