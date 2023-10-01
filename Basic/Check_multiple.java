package Basic;

import java.util.Scanner;
public class Check_multiple {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int num2=sc.nextInt();
		
		
		if ((num1%num2)==0) {
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
	}
}
