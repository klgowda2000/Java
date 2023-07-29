package com.kodnest.patterns.assignment;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++)
		{
			int no = 1;
			for(int j=1;j<=i*2-1;j++)
			{
				if(j==1 || j==i*2-1)
				{
					System.out.print("* ");
				}
				else
				{
					if(j<=i*2/2)
					{
						System.out.print(no+" ");
						if(j!=i*2/2)
						no++;
					}
					else
						System.out.print(--no+" ");
					
				}
			}
			System.out.println();
		}
		
		
		for(int i=3; i>=1; i--)
		{
			int no = 1;
			for(int j=1; j<=i*2-1; j++)
			{
				if(j==1 || j==i*2-1)
					{
						System.out.print("* ");
					}
					else
					{
						if(j<=i*2/2)
						{
							System.out.print(no+" ");
							if(j!=i*2/2)
							no++;
						}
						else
							System.out.print(--no+" ");
						
					}
			}
			System.out.println();
		}

	}

}
