
public class ReverseNumber {
	
	public int reverse(int n) {
		int reverseNumber = 0;
		int rem;
		while(n!=0)
		{
			rem = n%10;
			reverseNumber= reverseNumber*10+rem;
			n = n/10;
		}
		return reverseNumber;
	}

}
