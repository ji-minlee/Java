package java010;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P06 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P06 thread = new P06();
		thread.start();
	}

	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String currentTime = format.format(time);
		System.out.println("Now : " + currentTime);

		System.out.println("Please input the time you want (by seconds)");
		Scanner sc = new Scanner(System.in);
		int inputTime = sc.nextInt();

		try {
			Thread.sleep(1000 * inputTime);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Date timerTime = new Date();
			String resultTime = format.format(timerTime);
			System.out.println("Time is over (" + resultTime + ")");
		}
	}
}
