import java.util.Scanner;

public class Main {
	
	
//	my program
//	public static void identifyCharacter(char ch)
//
//	{
//
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//		{
//			System.out.println("Lower-case vowel");
//		}
//		else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
//		{
//			System.out.println("Upper-case vowel");
//		}
//		else if (ch>='a' && ch<='z')
//		{
//			System.out.println("Lower-case consonant");
//		}
//		else if (ch>='A' && ch<='Z')
//		{
//			System.out.println("Upper-case consonant");
//		}
//		else if (ch>='0' && ch<='9')
//		{
//			System.out.println("Digit");
//		}
//		else
//		{
//			System.out.println("Special Character");
//		}
//
//	}
	

	// nawaz program
	
//		public static void identifyCharacter(char ch){
//			boolean lower = Character.isLowerCase(ch);
//			boolean upper = Character.isUpperCase(ch);
//			boolean isDigit = Character.isDigit(ch);
//			
////			boolean vowel = false;
//			
//			String vowels = "aeiouAEIOU";
//			String specialCharacters = "!@#$%^&*+-_=:;(){}/'\'|[]";
//			
//			boolean specialCharactersResult = specialCharacters.indexOf(ch)!=-1?true:false;
//			boolean vowelsResult = vowels.indexOf(ch)!=-1?true:false;
//			if(lower && vowelsResult) {
//				System.out.println("Lower Case Vowel");
//			}
//			else if(upper && vowelsResult) {
//				System.out.println("Upper Case Vowel");
//			}
//			else if(upper) {
//				System.out.println("Upper Case Consonant");
//			}
//			else if(lower) {
//				System.out.println("Lower Case Consonant");
//			}
//			else if(isDigit) {
//				System.out.println("Digit");
//			}
//			else if(specialCharactersResult) {
//				System.out.println("Special Character");
//			}
//			else {
//				System.out.println("Enter A Single Character");
//			}
//			
//		}
	//
//		public static void main(String[] args){
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a Character");
//			char ch = sc.next().charAt(0);
//			identifyCharacter(ch);
//			sc.close();
	//
//		}


	
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Entered Character "+ch+" is digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Entered Character "+ch+" is special character");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': 
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered Character "+ch+" is lower case vowel");
				}
				else
				{
					System.out.println("Entered Character "+ch+" is upper case vowel");
				}
				break;
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered Character "+ch+" is lower case consonent");
				}
				else
				{
					System.out.println("Entered Character "+ch+" is upper case consonent");
				}
					
				
				}
			}
		}
	

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char a = sc.next().charAt(0);
		identifyCharacter(a);
		sc.close();

	}
	


}
