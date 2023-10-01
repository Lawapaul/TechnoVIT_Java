package Arrays;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int c[]=new int[5];
		
		for(int i=0;i<=4;i++) {
			System.out.print("Enter Temperature " + i + " : ");
			c[i]=sc.nextInt();
			
		}
		int dh=0;
		for (int x:c)
			if (x>=85) {
			  dh=dh+1;
	
			}
		System.out.println("No of Hot days: " + dh);
		
		int dc=0;
		for (int y:c) {
			if (y<=45)
				dc=dc+1;
		}
		System.out.println("Not of Cold Days: " + dc);
		
		int dp=0;
		for (int z:c) {
				if ((z>45) && (z<85))
			        dp=dp+1;
		}
		System.out.println("No of Pleasant days: " + dp);
		
		
		}
}
		
	



	


