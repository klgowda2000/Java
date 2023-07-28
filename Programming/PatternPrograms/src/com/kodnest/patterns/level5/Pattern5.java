package com.kodnest.patterns.level5;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch = 'A';  for printing different letter on different line
		for(int i = 1; i<=5; i++)
		{
			char ch = 'A'; //for printing sequence of letters on different line
			for(int j = 1; j<=i ; j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
