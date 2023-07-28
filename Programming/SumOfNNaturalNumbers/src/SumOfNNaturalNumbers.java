import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n to find the sum of first n natural numbers");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println("The sum of first "+n+" natural number is "+sum);
		sc.close();

	}

}
