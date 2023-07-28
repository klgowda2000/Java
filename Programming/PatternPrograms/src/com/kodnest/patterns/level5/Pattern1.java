package com.kodnest.patterns.level5;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 1; i<=3 ; i++)
//		{
//			System.out.print("* ");
//			for(int j = 1; j<=1 ; j++)
//			{
//				if(i==1 || i==3)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.print("* ");
//			System.out.println();
//		}
		
		//Sir logic
		for(int i = 1 ; i<=3 ; i++)
		{
			for(int j = 1; j<=3; j++)
			{
				if(i==1 || i==3 || j==1 || j==3 || i==j) //for diagonal give condition i==j
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
