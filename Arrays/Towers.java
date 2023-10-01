package Arrays;

import java.util.Scanner;
public class Towers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int freq=40;
		
		System.out.print("Enter Number of Towers: ");
		int a=sc.nextInt();
		int lst[]=new int[a];	
		for (int i=0;i<=a-1;i++) {
			System.out.print("Enter Tower "+ i +" data: ");
			lst[i]=sc.nextInt();
		}
		
		for (int x:lst) {
			if (x<=freq) {
				System.out.println("Tower with Distance " + x +  " is useless.");
			}
			
			
			}
	}
}
			