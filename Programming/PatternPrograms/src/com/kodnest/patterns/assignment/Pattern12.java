package com.kodnest.patterns.assignment;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			if(i==5)
				System.out.print("********");
			else
				System.out.print("        ");
			for(int j=3; j<=(i*2)-1; j++)
			{
				if(i==5)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			if(i>=1)
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=4; i>=1; i--)
		{
			System.out.print("        ");
			for(int j=3; j<=(i*2)-1; j++)
			{
				System.out.print(" ");
			}
			if(i!=0)
			System.out.print("*");
			
			System.out.println();
		}
	}

}
