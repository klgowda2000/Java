package com.kodnest.patterns.assignment;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if( (i<=5 && j==1) || j==9 || i==5 || i==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
