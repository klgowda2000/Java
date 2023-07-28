import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n) {

		int sum = 0;
		int rem;
		while(n!=0)
		{
			rem = n%10;
			sum+=rem;
			n = n/10;
		}
		System.out.println("The sum of the digits are "+sum);

		}

		public static void main(String[] args)

		{

			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the numbers to find the sum of digits present in it");

			int n=scan.nextInt();

			calculateSumOfDigits(n);

			scan.close();

		}
}
