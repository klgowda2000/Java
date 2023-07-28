import java.util.Scanner;

public class Main {
	
//	public static void checkMultipleOfTen(int n) { 
//		// your code here 
//		System.out.println(n%10==0 ? "The number is a multiple of 10" : "The number is not a multiple of 10.");
//		}
	
	public static void checkMultiple(int multiple, int n) { 
		// your code here 
		System.out.println(multiple%n==0 ? "The "+multiple+" is a multiple of "+n : "The "+multiple+" is not a multiple of "+n);
		}
		
		public static void main(String[] args) { 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two number to check whether first number is multiple of second number");
			int multiple = sc.nextInt();
			int n = sc.nextInt();
			checkMultiple(multiple,n);
			sc.close();
		}
	}


