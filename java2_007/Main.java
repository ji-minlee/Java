package java2_007;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		long startTime = System.currentTimeMillis();
		
		Date timeinDate = new Date(startTime);
		String timeInFormat = sdf.format(timeinDate);
		
		long starthours = startTime / (1000*60*60);
		long startminutes = TimeUnit.MILLISECONDS.toMinutes(startTime);
		long startseconds = TimeUnit.MILLISECONDS.toSeconds(startTime);
		long finishTime = System.currentTimeMillis();
		
		long secDiffTimeSec = (finishTime - startTime) / 1000 % 60;
		long secDiffTimeMin = (finishTime - startTime) / 1000 / 60;
		
		System.out.println(timeInFormat);
}
}