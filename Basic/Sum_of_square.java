package Basic;

import java.util.Scanner;
public class Sum_of_square {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,a,sum=0;
		System.out.print("Enter Number: ");
		n=sc.nextInt();
		System.out.print("Enter Range: ");
		a=sc.nextInt();
		
		for(int i=n;i<=a;i++) {
			
			sum=sum+(i*i);
			
		}
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
	}

}
