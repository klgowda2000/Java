package com.kodnest.patterns.assignment;

public class Pattern18 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=3; j<=(i*2)-1; j++)
			{
				System.out.print(" ");
			}
			if(i>1)
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=4; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=3; j<=(i*2)-1; j++)
			{
				System.out.print(" ");
			}
			if(i!=1)
			System.out.print("*");
			
			System.out.println();
		}

	}

}
