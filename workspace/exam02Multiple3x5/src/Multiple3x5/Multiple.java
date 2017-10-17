package Multiple3x5;

public class Multiple {
	int max;
	
	public Multiple(int max)
	{
		this.max = max;
	}
	
	public int sum()
	{
		int sum = 0;
		int i;
		
		for(i = 0 ; i < max ; i++)
		{
			if((i % 3 == 0) || (i % 5 == 0))
			{
				sum += i;
			}
		}
		
		return sum;
	}
}
