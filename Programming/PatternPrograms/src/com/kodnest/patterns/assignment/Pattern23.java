package com.kodnest.patterns.assignment;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=8; i++)
		{
			for(int j=1; j<=8; j++)
			{
				if(j==1 || j==8 || i==j )
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
