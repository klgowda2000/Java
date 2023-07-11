import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
		sc.close();
	}
	
	public static double halveTheNumber(double num)
	{
		return num/2.0;
	}

}
