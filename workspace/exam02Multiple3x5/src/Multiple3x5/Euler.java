package Multiple3x5;

public class Euler extends Multiple
{
	public static void main(String[] args)
	{
		Multiple mM = new Multiple(10);
		int sum;
		
		sum = mM.sum();
		
		System.out.printf("Sum = %d", sum);
	}
}
