package java2_008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P002 {
//Buffered 읽고 쓰기 / 20220421 / k32_이지민 / 주석에는 k32_생략

	public static void FileWrite() throws IOException { // IOException 모든 특이사항을 던져버린다(throw)
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\Mytest.txt"); // 파일 생성
		BufferedWriter k32_bw = new BufferedWriter(new FileWriter(k32_f));	// 파일 내용 추가
		// 아래와 같이 파일의 내용을 추가한다
		k32_bw.write("안녕 파일");	
		k32_bw.newLine();	// 한 줄 띄우기
		k32_bw.write("hello 헬로");
		k32_bw.newLine();

		k32_bw.close();	// 파일을 닫는다. > close를 안하면 계속 파일이 열려 있어 제어 불가능

	}

	public static void FileRead() throws IOException { // IOException 모든 특이사항을 던져버린다(throw)
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\Mytest.txt");	// 파일 지정
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// 파일을 읽기

		String k32_readtxt;	// 파일 내용을 읽은 것을 저장할 문자열 변수 선언

		while ((k32_readtxt = k32_br.readLine()) != null) {	// 파일 내용이 계속 존재하면 (null이 아니면) > readLine은 한 줄 단위로 읽는다
			System.out.printf("%s\n", k32_readtxt);	// 파일 내용을 출력
		}

		k32_br.close();	// 파일을 닫는다. > close를 안하면 계속 파일이 열려 있어 제어 불가능
	}

	public static void main(String[] args) throws IOException {	// IOException 모든 특이사항을 던져버린다(throw)
		// TODO Auto-generated method stub
		FileWrite();	// 파일을 만드는 함수
		FileRead();		// 파일을 읽는 함수 
	}

}
