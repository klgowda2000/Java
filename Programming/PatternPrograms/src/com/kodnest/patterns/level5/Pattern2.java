package com.kodnest.patterns.level5;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=5 ; i++)
		{
			System.out.print("* ");
			for(int j = 1; j<=3 ; j++)
			{
				if(i==1 || i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("* ");
			System.out.println();
		}


	}

}
