
public class ArmStrong {

	public double armstrongChecker(int n)
	{
		double result = 0;
		ArmStrong a = new ArmStrong();
		int power = a.returnDigit(n);
//		System.out.println("N value"+n);
		while(n!=0)
		{
			int rem = n%10;
			result = result+Math.pow(rem,power);
			n=n/10;
		}
		return result;
	}
	
	public int returnDigit(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
//		System.out.println("power "+count);
		return count;
	}
}
