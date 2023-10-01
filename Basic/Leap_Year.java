package Basic;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int num1=sc.nextInt();
		
		
		if ((num1%4==0) && (num1%100!=0)) {
			System.out.println("It is a leap year");
		}
		else if ((num1%400==0) && (num1%100==0)) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap Year");
		}
		
	}
	
}
	
		