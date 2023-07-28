import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n to find its factorial");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
		sc.close();


	}

}
