package Basic;

import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		
		int i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=3;i++) {
			System.out.print("Enter Number " + i + " : ");
			int a=sc.nextInt();
			sum=sum+a;
		}
		
		
		int b=(sum/3);
		
		if (b>=90)
			System.out.println("Grade A");
		
		else if ((b<90) && (b>=80))
			System.out.println("Grade B");
		
		else if ((b<80) && (b>=70))
			System.out.println("Grade C");
		
		else if ((b<70) && (b>=60))
			System.out.println("Grade D");
		
		else if (b<50)
			System.out.println("Grade F");
		
	
		
	}	
	

}
	
