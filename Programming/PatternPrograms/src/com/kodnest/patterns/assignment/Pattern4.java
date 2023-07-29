package com.kodnest.patterns.assignment;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int up = 10;
		int down =1;
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=up;j++)
			{
				System.out.print(" ");
			}
			up-=2;
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=6; i++)
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print("*");
			}
			for(int j=2;j<=down;j++)
			{
				System.out.print(" ");
			}
			down+=2;
			for(int j=6; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
