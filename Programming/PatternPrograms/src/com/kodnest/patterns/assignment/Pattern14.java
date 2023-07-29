package com.kodnest.patterns.assignment;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
		for(int i=1; i<=8; i++)
		{
			System.out.print("    ");
			for(int j=i; j<=8; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=8; i++)
		{
			System.out.print("    ");

			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
