package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A201_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      ArrayList<String> list = new ArrayList<String>();
	      ArrayList<Integer> numberList = new ArrayList<Integer>();
	      ArrayList<String> result = new ArrayList<String>();
	      String nameAndScore;

	      System.out.println("input 5set names and scores. ex) Mike 89");

	      for (int i = 0; i < 5; i++) {
	         nameAndScore = sc.nextLine();
	         list.add(nameAndScore);
	      }

	      for (int i = 0; i < list.size(); i++) {
	         numberList.add(Integer.parseInt(list.get(i).substring(list.get(i).indexOf(" ") + 1)));
	      }

	      Collections.sort(numberList);
	      Collections.reverse(numberList);

	      for (int i = 0; i < 5; i++) {
	         for (int j = 0; j < 5; j++) {
	            if (list.get(j).contains(Integer.toString(numberList.get(i)))) {
	               result.add(list.get(j).substring(0, list.get(j).indexOf(" ")));
	            }
	         }
	      }
	      
	      System.out.println(result);

	}

}
