import java.util.Scanner;

public class FactorOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n to find its factor");
		int n = sc.nextInt();
		System.out.println("The factors of "+n+" are:");
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
