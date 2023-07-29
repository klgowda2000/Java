package com.kodnest.patterns.assignment;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=6; i++)
		{
			for(int j=i; j<=6; j++)
			{
				if(i==1 || j==i || j==6)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
