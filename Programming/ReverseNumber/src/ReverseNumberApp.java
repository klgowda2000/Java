import java.util.Scanner;

public class ReverseNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in order to reverse it");
		int n = sc.nextInt();
		ReverseNumber a = new ReverseNumber();
		int reverse = a.reverse(n);
		System.out.println("The reverse of the number "+n+" is "+reverse);
		System.out.println(n==reverse ? "It is a palindrome" : "It is not a palindrom");
		sc.close();
	}
}
