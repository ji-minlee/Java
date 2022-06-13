package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P007 {
//파일 훑어보고 감잡기 / 20220421 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\실습데이터\\day_data\\THTSKS010H00.dat");
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// 파일 불러와서 읽기
		
		String k32_readtxt;	// 문자열 변수 text 읽기 선언
		int k32_LineCnt = 0;	// 정수형 변수 line count 선언 및 0으로 초기화
		int k32_n = 1;	// 정수형 변수 n을 선언 및 1로 초기화
		
		//시간 형태 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 시간 형태 지정하기
		long k32_startTime = System.currentTimeMillis();	// 코드 실행 전에 시간 받아오기 (시작 시간)
		Date k32_startInDate = new Date(k32_startTime);	// 형태 날짜로 변환
		String k32_startFormat = sdf.format(k32_startInDate);	// 문자열 변수로 형태 변환
		
		StringBuffer k32_s = new StringBuffer();	// stringbuffer 선언
		while (true) {	// 무한 루프 
			char[] k32_ch = new char[1000];	// 문자 배열 선언 및 1000으로 초기화
			
			k32_n = k32_br.read(k32_ch);	// 문자 배열을 추가해 n에 대입 > 문자 갯수 파악 가능
			
			if (k32_n == -1) break;	// 내용이 하나도 없으면 break
			
			for (char k32_c : k32_ch) {	// 문자 배열을 문자형 변수 c라 할 때
				if (k32_c == '\n') {	// 줄 바꾸기라면
					System.out.printf("[%s]***\n", k32_s.toString());	// 줄 바꾸는 형태로 출력
					k32_s.delete(0, k32_s.length());	// s의 길이만큼 s에서 지운다 > reset
					} else {	// 줄 바꾸는 것이 아닌 내용이라면
					k32_s.append(k32_c);	// c를 s(stringbuffer)에 추가
				}
			}
			k32_LineCnt++;	// linecount를 1 증가
		}
		System.out.printf("[%s]***\n", k32_s.toString());	// 문자열 형태로 출력
		k32_br.close();	// 파일 닫기
		
		long k32_finishTime = System.currentTimeMillis();	// 코드 실행 후에 시간 받아오기
		Date k32_finishInDate = new Date(k32_finishTime);	// 형태 날짜로 변환
		String k32_finishFormat = sdf.format(k32_finishInDate);	// 문자열 변수로 형태 변환
		
		long k32_diffTime = (k32_finishTime - k32_startTime); // 시간 차이 계산 
		long k32_diffTimeMin = (k32_diffTime / 1000 / 60);	// 분 구하기
		long k32_diffTimeSec = (k32_diffTime / 1000 % 60);	// 초 구하기
		
		System.out.println("시작 시간 : " + k32_startFormat);	// 시작 시간 출력
		System.out.println("종료 시간 : " + k32_finishFormat);	// 종료 시간 출력
		System.out.println("시간 차이 : " + k32_diffTimeMin + "분 " + k32_diffTimeSec + "초");	// 시간 차이 출력
		System.out.println("총 항목 개수 : " + k32_LineCnt);	// 총 항목 개수 출력
	}

}
