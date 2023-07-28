package com.kodnest.patterns.level5;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mid = 3;
//		for(int i = 1; i<=3 ; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				if(i==1)
//				{
//					if(j!=mid)
//					{
//						System.out.print("  ");
//					}
//					else
//					{
//						System.out.print("* ");
//					}
//				}
//				else if(i==3)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					if(j==mid-1 || j==mid-1+2) 
//					{
//						System.out.print("* ");
//					}
//					else
//					{
//						System.out.print("  ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		System.out.println("Enter the no of lines");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int mid = line;
		for(int i = 1; i<=line ; i++)
		{
			for(int j=1; j<=line*2-1; j++)
			{
				if(i==1)
				{
					if(j!=mid)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else if(i==line)
				{
					System.out.print("* ");
				}
				else
				{
					if(j==mid-(i-1) || j==mid-(i-1)+((i-1)*2))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
		

	}

}
