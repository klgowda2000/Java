package com.kodnest.patterns.assignment;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<(i-1)*2*2;j++ )
			{
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=(i*2*2)-4;j++)
			{
				System.out.print(" ");
			}

			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
