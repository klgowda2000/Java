import java.util.Scanner;

public class PrimeNumberWithCount {

	public static int checkPrime(int number)
	{
		for(int i=2; i<number; i++)
		{
			if(number%i==0)
			{
				return 0;
			}
		}
		return number;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to find prime numbers");
		int number = sc.nextInt();
		int count = 0;
		for(int i =3; i<=number;i++)
		{
			int res = checkPrime(i);
			if(res!=0)
			{
				System.out.println(res);
				count++;
			}
		}
		System.out.println("The count is "+count);

	}

}
