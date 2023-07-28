import java.util.Scanner;

public class ArmstrongApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is armstrong or not");
		int n = sc.nextInt();
		ArmStrong a = new ArmStrong();
		double result = a.armstrongChecker(n);
		System.out.println(n==result? "The given number "+(int)n+" is armstrong number" : "The given number "+(int)n+" is not armstrong number");	
//		System.out.println(result);
		sc.close();
	}

}
