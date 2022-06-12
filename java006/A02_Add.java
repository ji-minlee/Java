package java006;

import java.util.Scanner;

public class A02_Add {
	 public static int input = 0;
	    public static void main(String[] args) {
	       inputNumber();
	       reverseNumber();
	    }
	    
	   public static void inputNumber() {
	      Scanner sc = new Scanner(System.in);
	      input = sc.nextInt();
	   }
	   
	   public static void reverseNumber() {
	      int result = 0;
	      while (input > 0) {
	         int remain = input % 10;
	         result = result * 10 + remain;
	         input /= 10;
	      }
	      System.out.println(result);
	   }
	}