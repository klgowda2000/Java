
public class DisplayNumber {
	
	public void one()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void two()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void three()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void four()
	{
		for(int i=1;i<=100;i++)
		{
			if((i%2==0) && (i%5==0))
			{
				System.out.println(i);
			}
		}
	}
	
	public void five()
	{
		for(int i=1;i<=100;i++)
		{
			if((i%3==0)&&(i%5==0))
			{
				System.out.println(i);
			}
		}
	}
	
	public void six()
	{
		
		System.out.println(2);
		for(int i=3;i<=100;i++)
		{
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if(i%j==0)
				{
					prime = false;
				}
			}
			if(prime)
			{
				System.out.println(i);
			}
			
		}
	}
	
	public void seven()
	{
		for(int i = 0; i<=100; i+=2)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void eight()
	{
		for(int i = 1; i<=100; i+=2)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
