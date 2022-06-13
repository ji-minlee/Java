package java2_007;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P010 {
// 다 페이지 성적 집계표 /
	static ArrayList<P009_OneRec> k32_ArrayOneRec = new ArrayList <P009_OneRec>();	// ArrayList 선언
	static int k32_sumKorCurrent = 0;	// 현재 페이지의 국어 성적의 합
	static int k32_sumEngCurrent = 0;	// 현재 페이지의 영어 성적의 합
	static int k32_sumMathCurrent = 0;	// 현재 페이지의 수학 성적의 합
	static int k32_sumSumCurrent = 0;	// 현재 페이지의 성적 총합의 합
	static double k32_sumAvgCurrent = 0;	// 현재 페이지의 성적 평균의 합의 합 
	static int k32_sumKorTotal = 0;		// 누적 페이지 국어 성적의 합
	static int k32_sumEngTotal = 0;		// 누적 페이지 영어 성적의 합
	static int k32_sumMathTotal = 0;	// 누적 페이지 수학 성적의 합
	static int k32_sumSumTotal = 0;		// 누적 페이지 성적 총합의 합
	static double k32_sumAvgTotal = 0;	// 누적 페이지 평균의 합의 합
	
	static int k32_count = 0; // 인원 수 측정 카운터
	
	static final int k32_iPerson = 200;	// 총 인원 수 
	static final int k32_pgPerson = 30;	// 페이지 인원 수 
	static int k32_currentPgPerson = 0; //현재 페이지 인원 수
	static int k32_currentStackpgPerson = 0; // 현재 페이지의 누적 인원 수
	
	static int k32_totalPg = 0; 	// 전체 페이지 수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k32_dataSet();	// 데이터 만드는 함수
		k32_dataSort();	// 데이터 정렬 함수 
		for (int k32_i = 0; k32_i < k32_totalPg; k32_i++) {	// 전체 페이지 수만큼 1씩 증가하며 반복
			k32_Header(k32_i);	// 헤더 부분 함수 
			for (int k32_j
					= 0; k32_j < k32_currentPgPerson; k32_j ++) {	// 현재 페이지 사람 수 만큼 1씩 증가하며 반복
				k32_ItemPrint(k32_j);	// 내용 함수 
			}	
			k32_TailPrint();	// 마지막 부분 함수 
		}
		
		
	}
	
	public static void k32_dataSet() {
		for (int k32_i = 1; k32_i <= k32_iPerson; k32_i++) {	// 전체 인원수만큼 1씩 증가하며 반복 (for문)
			String k32_name = String.format("이지%03d", k32_i);	//문자열 이름생성, 1번부터 시작이라 + 1
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k32_kor = (int)(Math.random() * 100);	// 국어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_eng = (int)(Math.random() * 100);	// 영어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_math = (int)(Math.random() * 100);	// 수학점수 만들기, 실수형 > 정수형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄, 숫자에 1더한 이유는 1번부터 시작이기 때문이다.
			k32_ArrayOneRec.add(new P009_OneRec(k32_i, k32_name, k32_kor, k32_eng, k32_math)); 
			// 하나의 OneRec 클래스를 생성 후 array에 집어 넣음
			// 총 페이지 계산
			if (k32_iPerson % k32_pgPerson == 0) {	// 전체 인원 수 % 페이지 인원수 = 0 이면
				k32_totalPg = k32_iPerson / k32_pgPerson;	// 전체 페이지 = 전체 인원수 / 페이지 인원 수 
			} else {	// 0이 아니면
				k32_totalPg = (k32_iPerson / k32_pgPerson) + 1;	// 전체 페이지 = 전체 인원수 / 페이지 인원 수 +1
			}
			
		}
	}
	
	public static void k32_Header(int k32_i) {	// 헤더 부분 함수 선언
		SimpleDateFormat k32_format1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	// 날짜 형태 선언
		Date k32_time = new Date();	// 현재 날짜 불러오기
		String k32_time1 = k32_format1.format(k32_time);	// 현재 날짜 형태에 맞게 문자열 선언
		
		System.out.printf("PAGE: %d             출력일자 :"  + k32_time1 + "\n", k32_i + 1);	//현재 페이지(0이라 + 1)와 날짜를 출력한다.
		System.out.println("=================================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","번호","이름","국어","영어","수학","총점","평균");	//구분 출력
		System.out.println("=================================================");
		
		//페이지별 인원 수 설정
		if (k32_i +1 == k32_totalPg) {	//마지막 페이지라면
			if (k32_iPerson % k32_pgPerson == 0) {	// 전체 인원 수 % 페이지 인원수 = 0 이면
				k32_currentPgPerson = k32_pgPerson;	// 현재 페이지  = 페이지 인원 수 
			} else { // 0이 아니라면
				k32_currentPgPerson = k32_iPerson % k32_pgPerson;	// 현재 페이지 = 전체 인원 수 % 페이지 인원 수 
			}
		} else {	// 마지막 페이지가 아니라면
			k32_currentPgPerson = k32_pgPerson;	// 현재 페이지 인원 수 = 페이지 인원 수 
		}
		
		//페이지당 누적 인원 계산
		k32_currentStackpgPerson +=  k32_currentPgPerson;
	}

	public static void k32_ItemPrint(int k32_i) {	// 내용 함수 
		P009_OneRec k32_rec;	// 클래스 불러오기 
		
		k32_rec = k32_ArrayOneRec.get(k32_count
				);	// 변수 불러오기
		System.out.printf("%03d %5.5s  %3d     %3d    %3d    %3d    %.2f\n", 	// 형태에 맞게 출력
				k32_rec.k32_getStudent_id(), k32_rec.k32_getName(), k32_rec.k32_getKor(),
				k32_rec.k32_getEng(), k32_rec.k32_getMath(), k32_rec.k32_getSum(), k32_rec.k32_getAvg());
		
		// 누적합으로 점수를 계속 구한다
		k32_sumKorCurrent += k32_rec.k32_getKor();	k32_sumKorTotal += k32_rec.k32_getKor();
		k32_sumEngCurrent += k32_rec.k32_getEng();	k32_sumEngTotal += k32_rec.k32_getEng();
		k32_sumMathCurrent += k32_rec.k32_getMath();	k32_sumMathTotal += k32_rec.k32_getMath();
		k32_sumSumCurrent += k32_rec.k32_getSum();	k32_sumSumTotal += k32_rec.k32_getSum();
		k32_sumAvgCurrent += k32_rec.k32_getAvg();	k32_sumAvgTotal += k32_rec.k32_getAvg();
		
		k32_count++;	// 인원 수 카운트 1 증가
	}
	
	public static void k32_TailPrint() {	// 합계 부분, 마지막 부분 함수 
		System.out.println("=================================================");
		
		System.out.println("현재페이지");
		//현재 페이지의 과목별 성적합을 보여준다. 
		System.out.printf("%-2.2s         %4d   %4d   %4d   %4d   %.2f\n", "합계",k32_sumKorCurrent,
				k32_sumEngCurrent, k32_sumMathCurrent, k32_sumSumCurrent, k32_sumAvgCurrent);
		
		//현재 페이지의 과목별 평균을 보여준다. 
		System.out.printf("%-2.2s        %4.2f  %4.2f  %4.2f  %4.2f   %.2f\n", "평균",(double) k32_sumKorCurrent / k32_currentPgPerson,
				(double) k32_sumEngCurrent / k32_currentPgPerson, (double) k32_sumMathCurrent / k32_currentPgPerson,
				(double) k32_sumSumCurrent / k32_currentPgPerson, (double) k32_sumAvgCurrent / k32_currentPgPerson);
		
		System.out.println("=================================================");
		
		//지금까지 페이지의 과목별 성적합을 보여준다. 
		System.out.println("누적페이지");
		System.out.printf("%-2.2s        %4d    %4d   %4d   %4d   %.2f\n", "합계",k32_sumKorTotal,
				k32_sumEngTotal, k32_sumMathTotal, k32_sumSumTotal, k32_sumAvgTotal);
		
		//지금까지 페이지의 과목별 평균을 보여준다. 
		System.out.printf("%-2.2s       %4.2f   %4.2f   %4.2f  %4.2f  %.2f\n\n\n", "평균",(double) k32_sumKorTotal / k32_currentStackpgPerson,
				(double) k32_sumEngTotal / k32_currentStackpgPerson, (double) k32_sumMathTotal / k32_currentStackpgPerson,
				(double) k32_sumSumTotal / k32_currentStackpgPerson, (double) k32_sumAvgTotal / k32_currentStackpgPerson);
		
		// 현재 페이지 합계 초기화
		k32_sumKorCurrent = 0;
		k32_sumEngCurrent = 0;
		k32_sumMathCurrent = 0;
		k32_sumSumCurrent = 0;
		k32_sumAvgCurrent = 0;
		
		
	}
	
	public static void k32_dataSort() {
		Comparator<P009_OneRec> k32_bikyeokijun = new Comparator<P009_OneRec>() {
			public int compare(P009_OneRec a1, P009_OneRec a2) {
				return ( a2.k32_getSum() - a1.k32_getSum());
			}
		};
		Collections.sort(k32_ArrayOneRec, k32_bikyeokijun);
	}
}

