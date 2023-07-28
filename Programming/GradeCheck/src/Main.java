import java.util.Scanner;

public class Main {
	
	public static void checkGrade(int grade)

	{ // your code here
		System.out.println(grade>50 ? "Pass" : "Fail");
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade");
		int grade = sc.nextInt();
		checkGrade(grade);
		sc.close();
	}

}
