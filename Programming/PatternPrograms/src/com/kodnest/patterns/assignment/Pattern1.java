package com.kodnest.patterns.assignment;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=6; i>=1; i--)
		{
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int j=6; j>=i; j--)
			{
				System.out.print(a+" ");
			}
//			for(int j=i-1; j>=1; j--)
//			{
//				System.out.print(" ");
//			}
			System.out.println();
			a++;
		}

	}

}
