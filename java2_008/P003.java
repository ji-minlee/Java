package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P003 {
// 실제 파일에 응용 / 20220421 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws IOException {	// IOException 모든 특이사항을 던져버린다(throw)
		// TODO Auto-generated method stub
		// \는 특수문자이므로 \\로 2개를 써야 한다
		File k32_f = new File ("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\12_04_07_E_무료와이파이정보_서울.csv");	// 파일 지정
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));	// 파일 읽기
		
		String k32_readtxt;	// 문자열 변수 (파일 읽은 내용) 선언
		
		//한 줄을 먼저 읽어야 필드명을 알 수 있다
		if ((k32_readtxt = k32_br.readLine()) == null) {	// 파일 내용이 한 줄도 없으면
			System.out.println("빈 파일입니다");	// 내용 출력
			return;	
		}
		
		String[] k32_field_name = k32_readtxt.split(",");	// 필드명을 쉼표 단위로 잘라 문자열 배열로 선언
		
		int k32_LineCount = 0;	// 파일의 줄을 세는 정수형 변수 선언 및 0으로 초기화
		while ((k32_readtxt = k32_br.readLine()) != null) {	// 파일 내용이 0이 아니면 > 파일 내용이 있으면
			String[] k32_field = k32_readtxt.split(",");	// 파일의 필드 내용을 쉼표 단위로 잘라 문자열 배열로 선언
			System.out.printf("**[%d번째 항목]**********************\n", k32_LineCount);	// 결과 출력
			for (int k32_j = 0; k32_j < k32_field_name.length; k32_j++) {	// 정수형 변수가 필드명의 항목만큼 1씩 증가하며 반복 (for문)
				System.out.printf(" %s : %s\n", k32_field_name[k32_j], k32_field[k32_j]);	// 필드명과 필드 내용을 출력
			}
			System.out.println("************************************");
			if (k32_LineCount == 100) break;	// 변수 lineCount가 100이 되면 종료
			k32_LineCount++;	// 변수 lineCount가 1 증가
		}
		
		k32_br.close();	// 파일을 닫는다
	}

}
