package com.kodnest.patterns.assignment;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
