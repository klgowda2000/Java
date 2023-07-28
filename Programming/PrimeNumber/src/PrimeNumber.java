import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not");
		int n = sc.nextInt();
		sc.close();

//		boolean prime = false;
//		for(int i = 2; i<n; i++)
//		{
//			if(n%i==0)
//			{
//				prime = true;
//				break;
//			}
//		}
//		if(prime)
//		{
//			System.out.println(n+" is not a prime number");
//		}
//		else
//		{
//			System.out.println(n+" is a prime number");
//		}
		for(int i = 2; i*i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				return;
			}
		}
		System.out.println(n+" is a prime number");

	}
}
