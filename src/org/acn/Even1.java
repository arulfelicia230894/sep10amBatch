package org.acn;

import java.util.Scanner;

public class Even1 {

	public static void main(String[] args) {
		int i,evenSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int i1 = sc.nextInt();
		for(i=1;i<=i1;i++) {
			if(i%2==0)
			{
				evenSum=evenSum+i;
				
			}
		}
		System.out.println("\n The sum of Even numbers upto "+ i1 +" = " +evenSum);
		
	}

}
