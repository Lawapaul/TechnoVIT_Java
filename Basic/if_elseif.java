package Basic;

import java.util.Scanner;

public class if_elseif {

	public static void main(String[] args) {
		
		int mark=50;
		Scanner sc= new Scanner(System.in);
		float num1=sc.nextFloat();
		
		boolean b=(num1>=50);
		
		if (b) {
			System.out.println("Pass");
		
		}
		else {
			System.out.println("Fail");
			
		}
		System.out.println("Bye");
	}
}
