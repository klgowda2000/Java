package com.kodnest.patterns.assignment;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println();
		System.out.println();		
		for(int i=1; i<=5; i++)
		{
			System.out.print("           ");
			for(int j=5; j>=i; j--)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=3; j<=(i*2)-1; j++)
			{
				if(i==5)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			if(i==5)
				System.out.print("*************");
			System.out.println();
		}
		
		for(int i=4; i>=1; i--)
		{
			System.out.print("           ");
			for(int j=5; j>=i; j--)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
