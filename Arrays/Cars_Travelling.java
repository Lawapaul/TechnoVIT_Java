package Arrays;

import java.util.Scanner;
public class Cars_Travelling {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Range: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<=n-1;i++) {
			System.out.print("Enter Data " + i + " in the format of 0 or 1: ");
			a[i]=sc.nextInt();
			
		}
		
		int ea=0;
		for(int x:a) {
			if (x==1) {
				ea=ea+1;
			}
			
			
		}
		int ew=0;
		for (int y:a) {
			if (y==0) {
				ew=ew+1;
			}
			
		}
		
		System.out.print("Cars Passed: " + (ew+ea));
		
		
		
		
	}

}
