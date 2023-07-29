package com.kodnest.patterns.assignment;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=6;i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=6;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=6; i>=2;i--)
		{
			for(int j=i-1; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i-1; j<=6;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
