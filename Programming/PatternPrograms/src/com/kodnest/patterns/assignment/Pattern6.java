package com.kodnest.patterns.assignment;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		for(int i = 0; i<5; i++)
		{
			for(int j=i; j<5;j++)
			{
				System.out.print(" ");
			}
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(j+" ");
//			}
			for(int j=0; j<=i; j++)
			{
				if(j==0 || i==0)
					num=1;
				else
					num=num*(i-j+1)/j;
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
