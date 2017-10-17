package SelfNumber;

public class SelfNumber extends Generator
{
	public static void main(String[] args)
	{
		SelfNumber sg = new SelfNumber();
		int i;
		int sum = 0;
		
		for(i = 1 ; i < 5001 ; i++)
		{
			sum += sg.isCompare(i, i);
		}
		System.out.printf("sum = %d", sum);
	}
}
