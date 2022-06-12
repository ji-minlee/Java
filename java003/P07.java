package java003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P07 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		Scanner scanner = new Scanner(System.in);

		String startDate = scanner.nextLine();
		String endDate = scanner.nextLine();

		Date startFormat = new SimpleDateFormat("yyyyMMdd").parse(startDate);
		Date endFormat = new SimpleDateFormat("yyyyMMdd").parse(endDate);

		long diffSec = (endFormat.getTime() - startFormat.getTime()) / 1000; // 초 차이
		long diffDate = diffSec / (24 * 60 * 60); // 일자 수 차이

		System.out.println(diffDate);

	}

}
