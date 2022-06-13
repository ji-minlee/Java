package java2_007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//클래스의 ArrayList
public class P009 {
	static ArrayList<P009_OneRec> k32_ArrayOneRec = new ArrayList <P009_OneRec>();
	
	static int k32_sumkor = 0;	// 정수 정적 변수로 국어 성적 선언 및 0으로 초기화 > 공용으로 사용
	static int k32_sumeng = 0;	// 정수형 정적 변수 영어 성적 선언 및 0으로 초기화 > 공용으로 사용
	static int k32_summath = 0;	// 정수형 정적 변수 수학 성적 선언 및 0으로 초기화 > 공용으로 사용
	static int k32_sumsum = 0;	// 정수형 정적 변수 합의 합 선언 및 0으로 초기화 > 공용으로 사용
	static int k32_sumavg = 0;	// 정수형 정적 변수 평균의 합 선언 및 0으로 초기화 > 공용으로 사용
	static final int k32_iPerson = 20;
	
	public static void main(String[] args) {
		k32_dataSet();	// 데이터 셋팅
		k32_dataSort();
		k32_HeaderPrint();	// 헤더 인쇄
		for (int k32_i = 0; k32_i < k32_ArrayOneRec.size(); k32_i++) {	// 내용 인쇄
			k32_ItemPrint(k32_i);
		}
		k32_TailPrint();	// 꼬리 인쇄
	}
	//데이터 만들기
	public static void k32_dataSet() {
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {
			String k32_name = String.format("이지%02d", k32_i);	// 이름 만들기
			int k32_kor = (int)(Math.random() * 100);	// 국어 점수 만들기
			int k32_eng = (int)(Math.random() * 100);	// 영어 점수 만들기
			int k32_math = (int)(Math.random() * 100);	// 수학 점수 만들기
			k32_ArrayOneRec.add(new P009_OneRec(k32_i, k32_name, k32_kor, k32_eng, k32_math)); 
			// 하나의 OneRec 클래스를 생성 후 array에 집어 넣음
		}
	}
	
	
	//헤더 인쇄
	public static void k32_HeaderPrint() {	// 칸 맞춰 헤더 인쇄
		System.out.println("************************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s      %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.println("************************************************");
	}
	
	//내용 인쇄
	public static void k32_ItemPrint(int k32_i) {
		P009_OneRec rec; // oneRec 클래스 불러 오기 
		
		rec = k32_ArrayOneRec.get(k32_i);	// 변수 불러오기
		System.out.printf("%4d %4s %3d %3d %3d      %3d   %6.2f\n", rec.k32_getStudent_id(), rec.k32_getName(), rec.k32_getKor(), 
				rec.k32_getEng(), rec.k32_getMath(), rec.k32_getSum(), rec.k32_getAvg());	// 형태에 맞춰 출력하기
		
		k32_sumkor += rec.k32_getKor();	// 정적 변수에 불러온 국어 성적 누적합
		k32_sumeng += rec.k32_getEng();	// 정적 변수에 불러온 영어 성적 누적합
		k32_summath += rec.k32_getMath();	// 정적 변수에 불러온 수학 성적 누적합
		k32_sumsum += rec.k32_getSum();	// 정적 변수에 불러온 합의 합 누적합
		k32_sumavg += rec.k32_getAvg();	// 정적 변수에 불러온 평균의 합 누적합
	}
	
	//꼬리 인쇄
	public static void k32_TailPrint() {	// 합계 및 평균 형태에 맞춰 출력하기
		System.out.println("************************************************");
		System.out.printf("  국어합계 %d	        국어평균 : %6.2f\n", k32_sumkor, k32_sumkor/(double)k32_ArrayOneRec.size());
		System.out.printf("  영어합계 %d	        영어평균 : %6.2f\n", k32_sumeng, k32_sumeng/(double)k32_ArrayOneRec.size());
		System.out.printf("  수학합계 %d	        수학평균 : %6.2f\n", k32_sumkor, k32_summath/(double)k32_ArrayOneRec.size());
		System.out.println("************************************************");
		System.out.printf("  반평균합계 %d	반평균 : %6.2f\n",k32_sumavg, k32_sumavg/(double)k32_ArrayOneRec.size());
	}
	
	public static void k32_dataSort() {	// 데이터 정렬 함수
		Comparator<P009_OneRec> k32_bikyeokijun = new Comparator<P009_OneRec>() {
			public int compare(P009_OneRec a1, P009_OneRec a2) {	// 정수 비교 하기
				return ( a2.k32_getSum() - a1.k32_getSum());	// 합계의 차를 비교값 리턴
			}
		};
		Collections.sort(k32_ArrayOneRec, k32_bikyeokijun);	// 설정한 대로 내용 정렬 (sort)
	}
}
