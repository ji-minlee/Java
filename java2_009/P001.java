package java2_009;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P001 {
//XML 파싱 기본 / 20220421 /  k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {	//throw로 특이 사항 던져버리기
		// TODO Auto-generated method stub
		DocumentBuilder k32_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// 파싱을 위한 준비
		// xml 파일 처리 , 전체 경로 지정, xml 파싱 처리
		Document k32_doc = k32_docBuilder.parse(new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\9강\\score.xml"));
		
		Element k32_root = k32_doc.getDocumentElement();	// root 태그를 가져오기도 하지만 지금은 쓰이는 곳이 없음
		
		NodeList k32_tag_name = k32_doc.getElementsByTagName("name");	// 이름 가져오기
		NodeList k32_tag_studentid = k32_doc.getElementsByTagName("studentid");	// 학번 가져오기
		NodeList k32_tag_kor = k32_doc.getElementsByTagName("kor");	// 국어 성적 가져오기
		NodeList k32_tag_eng = k32_doc.getElementsByTagName("eng");	// 영어 성적 가져오기
		NodeList k32_tag_mat = k32_doc.getElementsByTagName("mat");	// 수학 성적 가져오기
		
		System.out.println("****************************************************************");
		
		for (int k32_i = 0; k32_i < k32_tag_name.getLength(); k32_i++) {	// 이름의 갯수만큼 1씩 증가하며 반복 (for문)
			// 결과 출력 , string 주의!
			System.out.printf("이름 : %s\n", k32_tag_name.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k32_tag_studentid.item(k32_i).getFirstChild().getNodeValue());	
			System.out.printf("국어 : %s\n", k32_tag_kor.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", k32_tag_eng.item(k32_i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", k32_tag_mat.item(k32_i).getFirstChild().getNodeValue());
			System.out.println("****************************************************************");
			
		}
	}

}
