import java.util.Scanner;

public class DisplayNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayNumber d = new DisplayNumber();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("--------------MENU------------------");
			System.out.println("The number range through which answer is displayed is 1 to 100");
			System.out.println("Please select one of the choice");
			System.out.println("1. Display all numbers divisible by 2");
			System.out.println("2. Display all numbers divisible by 3");
			System.out.println("3. Display all numbers divisible by 5");
			System.out.println("4. Display all numbers divisible by 2 and 5");
			System.out.println("5. Display all numbers divisible by 3 and comes in table of 5");
			System.out.println("6. Display all prime numbers");
			System.out.println("7. Display all even numbers divisible by 3");
			System.out.println("8. Display all odd number divisible by 5");
			System.out.println("9. To exit from the program");
			
			int ch = sc.nextInt();
			switch(ch)
			{


			case 1:d.one();
			break;

			case 2:d.two();
			break;

			case 3:d.three();
			break;

			case 4:d.four();
			break;

			case 5:d.five();
			break;

			case 6:d.six();
			break;

			case 7:d.seven();
			break;

			case 8:d.eight();
			break;
			
			case 9: return;

			default:System.out.println("Enter a valid input");

			}
		}


	}

}
