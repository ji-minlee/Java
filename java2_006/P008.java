package java2_006;
//메소드 오버로딩 / 20220417 / k32_이지민 /주석은 k32_제외
public class P008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P008_scoreSumAvg k32_scoreCal = new P008_scoreSumAvg();	//P008_scoreSumAvg 클래스 scoreCal 선언
		
		//기본 성적 정보 입력(정수형)
		int k32_Korean = 80, k32_English = 90, k32_Math = 100, k32_Science = 100, k32_Society = 70,
			k32_Sum = 0;	// 정수형 변수 sum(합) 선언
		double k32_Avg= 0.0;	// 실수형 변수 avg(평균) 선언
		

		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean); // 3개의 성적을 받아서 평균을 구하는 다른 클래스의 메소드 실행(실수형)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean); // 3개의 성적을 받아서 합을 구하는 다른 클래스의 메소드 실행(정수형)
		
		// 이하 포멧에 맞춰서 메세지 출력
		System.out.println("3월 성적표");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","총점","평균");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d   %4d  %-4.1f\n\n","폴리융",k32_Korean,k32_English,k32_Math,k32_Sum,k32_Avg);
				
		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean, k32_Science); // 4개의 성적을 받아서 평균을 구하는 다른 클래스의 메소드 실행(실수형)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean, k32_Science); // 4개의 성적을 받아서 합을 구하는 다른 클래스의 메소드 실행(정수형)
		
		// 이하 포멧에 맞춰서 메세지 출력
		System.out.println("4월 성적표");
		System.out.printf("========================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","과학","총점","평균");
		System.out.printf("========================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d   %4d  %4d  %4.1f\n\n","폴리융",k32_Korean,k32_English,k32_Math,k32_Science,k32_Sum,k32_Avg);
		
		k32_Avg = k32_scoreCal.k32_avg(k32_Math, k32_English, k32_Korean, k32_Science, k32_Society); //5개의 성적을 받아서 평균을 구하는 다른 클래스의 메소드 실행(실수형)
		k32_Sum = k32_scoreCal.k32_sum(k32_Math, k32_English, k32_Korean, k32_Science, k32_Society); //5개의 성적을 받아서 합을 구하는 다른 클래스의 메소드 실행(정수형)
		
		// 이하 포멧에 맞춰서 메세지 출력
		System.out.println("5월 성적표");
		System.out.printf("=================================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","과학","사회","총점","평균");
		System.out.printf("=================================================\n");
		System.out.printf("%-4.4s%-4d%4d  %4d  %4d  %4d   %4d %5.1f\n\n","폴리융",k32_Korean,k32_English,k32_Math,k32_Science,k32_Society,k32_Sum,k32_Avg);
	}

	}


