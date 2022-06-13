package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class P004 {
// 거리계산 / 20220421 / k32_이지민 / 주석에는 k32_생략 / 피타고라스의 정리 활용
	public static void main(String[] args) throws IOException {	// IOException 모든 특이사항을 던져버린다(throw)
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\12_04_07_E_무료와이파이정보_경기도_탭.txt");	// 파일 불러오기
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));	// 파일 읽기
		
		String k32_readtxt;	// 문자열 변수 (파일 읽은 내용) 선언
		
		if ((k32_readtxt = k32_br.readLine()) == null) {	// 파일에 한 줄도 내용이 없으면 (null)
			System.out.println("빈 파일입니다");	// 내용 출력
			return;
		}
		
		String[] k32_field_name = k32_readtxt.split("\t");	// 문자열 배열 필드명을 선언하고 읽은 내용을 빈칸 단위로 자른다
		
		double k32_lat = 37.3859;	// 폴리텍 위도
		double k32_lng = 127.1214;	// 폴리텍 경도
		
		int k32_LineCount = 0;	// 정수형 변수 줄 카운트를 선언하고 0으로 초기화
		while ((k32_readtxt = k32_br.readLine()) != null) {	// 파일에 내용이 존재하면 (null이 아니면)
			String[] k32_field = k32_readtxt.split("\t");	// 문자열 배열 필드 내용을 선언하고 읽은 내용을 빈칸 단위로 자른다
			System.out.printf("**[%d번째 항목]********************************\n",k32_LineCount);	// 몇 번째 항목인지 출력
			System.out.printf(" %s : %s\n", k32_field_name[9], k32_field[9]);	// 도로명 주소 출력
			System.out.printf(" %s : %s\n", k32_field_name[13], k32_field[13]);	// 위도 출력
			System.out.printf(" %s : %s\n", k32_field_name[14], k32_field[14]);	// 경도 출력
			double k32_distance = Math.sqrt(Math.pow(Double.parseDouble(k32_field[13])-k32_lat, 2)) + Math.pow(Double.parseDouble(k32_field[14])-k32_lng, 2);	
			// 우리집에서부터의 거리 구하기 > 거리는 피타고라스의 정리를 활용해 구한다
			System.out.printf(" 현재지점과 거리 : %f\n", k32_distance);	
			System.out.println("**********************************************");
			k32_LineCount++;	// 다음 줄로 넘어간다 (1 증가)
		}
		
		k32_br.close();	// 파일을 닫는다
	}

}
