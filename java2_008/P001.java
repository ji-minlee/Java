package java2_008;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P001 {
// 무식하게 읽고 쓰기 / 20220421 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\Mytest.txt");	// 파일 새로 만들기
			FileWriter k32_fw = new FileWriter(k32_f);	// 파일에 내용 추가
			// 아래의 내용을 파일에 추가한다
			k32_fw.write("안녕 파일\n");
			k32_fw.write("hello 헬로\n");

			k32_fw.close();	// 파일을 닫는다 

			FileReader k32_fr = new FileReader(k32_f);	// 파일을 읽는다
			

			int k32_n = -1;	// 정수형 변수 선언 및 -1로 초기화
			char[] k32_ch;	// 문자형 배열 선언
			
			while (true) {	// 무한 루프 선언
				k32_ch = new char[100];	// 문자형 배열 사이즈 100으로 초기화
				k32_n = k32_fr.read(k32_ch);	// 파일을 읽은 내용의 갯수를 센다

				if (k32_n == -1)	// 파일에 아무 내용이 없으면
					break;	// 파일 읽기를 중단한다

				for (int k32_i = 0; k32_i < k32_n; k32_i++) {	// n번 만큼 1씩 증가하며 반복 (for문)
					System.out.printf("%c", k32_ch[k32_i]);	// 파일의 내용 출력
				}
			}

			k32_fr.close();	// 파일을 닫는다	

			System.out.printf("\n FILE READ END ");	// 파일 읽기를 마쳤다는 내용 출력

		} catch (Exception e) {	// 에러 잡기
			System.out.printf("나 에러[%s]\n", e); // 에러 발생 시 에러의 내용과 에러 발생을 알리는 내용 출력
		}
	}

}
