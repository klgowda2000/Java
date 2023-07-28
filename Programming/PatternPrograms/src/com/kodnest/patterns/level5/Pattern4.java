package com.kodnest.patterns.level5;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mid = 3;
		for(int i = 1; i<=3 ; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1)
				{
					if(j!=mid)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else if(i==3)
				{
					System.out.print("* ");
				}
				else
				{
					if(j==mid-1 || j==mid-1+2) 
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		
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
