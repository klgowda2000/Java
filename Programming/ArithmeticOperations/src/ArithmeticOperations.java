import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two numbers for subtraction");
		int result = subtractNumbers(sc.nextInt(), sc.nextInt());
//		System.out.println("Subtraction Result: "+result);
		System.out.println(result);
//		System.out.println("Enter two numbers for multiplication");
		int result1 = multiplyNumbers(sc.nextInt(), sc.nextInt());
//		System.out.println("Multiplication Result: "+result1);
		System.out.println(result1);
//		System.out.println("Enter two numbers for division");
		double result2 = divideNumbers(sc.nextInt(), sc.nextInt());
		System.out.println(result2);
//		System.out.println("Division Result: "+result2);
//		System.out.println("Enter two numbers to find remainder");
		int result3 = findRemainder(sc.nextInt(),sc.nextInt());
		System.out.println(result3);
//		System.out.println("Remainder Result: "+result3);
		sc.close();

	}
	
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

}

// Sir solution is present in question file
