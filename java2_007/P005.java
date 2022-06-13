package java2_007;

public class P005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k32_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};	// 정수형 배열 선언 및 초기화
		
		for (int k32_i = 0; k32_i < k32_iArray.length; k32_i++) {	// 정수형 배열의 갯수만큼 1씩 증가하며 반복 (for문)
			System.out.printf("iArray[%d]=%d\n", k32_i, k32_iArray[k32_i]);		// 결과 출력
		}
		//MAX 찾기
		int k32_iMax = k32_iArray[0];	// 처음 시작 배열부터 시작
		int k32_iMaxPt = 0;	// 맥스 변수의 위치를 0부터 시작
		for (int k32_i = 0; k32_i < k32_iArray.length; k32_i++) {	// 배열의 갯수만큼 1씩 증가하며 반복 (for문)
			if(k32_iMax < k32_iArray[k32_i]) {	// 만일 기존 맥스 변수보다 배열값이 크다면
				k32_iMax = k32_iArray[k32_i];	// 기존 맥스 변수 값을 배열값으로 바꾸고
				k32_iMaxPt = k32_i;				// 기존 맥스 변수의 배열 위치 값도 바꾼다
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k32_iMaxPt, k32_iMax);	// 결과 출력
	}

}
