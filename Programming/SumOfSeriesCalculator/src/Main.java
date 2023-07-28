import java.util.Scanner;

public class Main {

	public static void calculateSumOfSeries(int n){
		
		double sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum+= 1.0/i;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to find sum of n series");
		int n = sc.nextInt();
		calculateSumOfSeries(n);
		sc.close();
		

	}

}
