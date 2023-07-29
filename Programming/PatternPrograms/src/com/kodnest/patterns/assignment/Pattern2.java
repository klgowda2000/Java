package com.kodnest.patterns.assignment;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		for(int i=1; i<=6; i++)
		{	
			for(int j = a-1; j>=1; j--)
			{
				System.out.print("  ");
			}
			for(int k = i;k>=1; k--)
			{
				System.out.print(k+" ");
			}
			for(int k = 2;k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			a--;
			
		}
	}

}
