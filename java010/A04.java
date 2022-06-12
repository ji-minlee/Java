package java010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class A04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader
				(new FileReader("C:\\Users\\jimin\\Desktop\\trafficvolume.csv"));
		String line;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0, avg, min, max; 
		
		while ((line = reader.readLine()) != null) {
			String[] lineCut = line.split(",");

			if (lineCut[1].equals("목")) {
				try {
					list.add(Integer.parseInt(lineCut[20]));
				} catch (Exception e) {

				}
			}

		}
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		min = Collections.min(list);
		max = Collections.max(list);
		avg = sum / list.size();
		
		System.out.println("최소 : " + min + ", 최대 : " + max + ", 합계 : " + sum + ", 평균 : " + avg);
	}
}

	
