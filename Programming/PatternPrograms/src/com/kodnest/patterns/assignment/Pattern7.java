package com.kodnest.patterns.assignment;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=5; i++)
		{
			char a = 'A';
			for(int j=1; j<=i*2-1; j++)
			{
				if(i==1 || j==1)
				{
					System.out.print(a+" ");
				}
				else
				{
					if(j<=i*2/2)
					{
						a++;
						System.out.print(a+" ");

					}
					else
					{
						a--;
						System.out.print(a+" ");

					}
				}
			}
			System.out.println();
		}

	}

}
