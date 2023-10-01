
/*
 * Ask students to write a program to find the average of given N positive integers and then
*  find out the number of elements exist less than the average and greater than the average. 
*  Ask students to execute the program.
 * 
 * 
 */

package Arrays;

import java.util.Scanner;
public class Average_number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.print("Enter Range: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<=n-1;i++) {
			System.out.print("Enter Number " + i + " : ");
		    a[i]=sc.nextInt();
			
		}
		
		
		for(int d:a)
			sum=sum+d;
		
			
		int avg=(sum/n);
		System.out.println("Average is: "+ avg);
		
		for (int y:a) {
			if (y<=avg){
				System.out.println("Less than average: " + y + " ");
			}
			else if (y>=avg) {
				System.out.println("Greater than average: "+y + " ");
			}
			
			
		}
		}
	
	
	
		
		
	}
	


