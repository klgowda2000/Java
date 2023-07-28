import java.util.Scanner;

public class Main {
	
	public static void getProduct(String productCode)

	{

		switch(productCode)
		{
		
			case "P01": System.out.println("COCA-COLA");
						break;
						
			case "P02":System.out.println("PEPSI");
						break;
			
			case "P03":System.out.println("SPRITE");
						break;
			
			case "P04":System.out.println("LIMCA");
						break;
						
			default: System.out.println("Enter the correct product code");
		
		}

	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode = sc.next();
		getProduct(productCode);
		sc.close();
	}

}
