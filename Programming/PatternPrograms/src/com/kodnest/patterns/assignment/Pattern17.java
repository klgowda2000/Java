package com.kodnest.patterns.assignment;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=6; i>=1; i--)
		{
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int j=6; j>=i; j--)
			{
				if(i==1 || j==6 || i==j)
				System.out.print("*"+" ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
