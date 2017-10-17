package SelfNumber;

public class Generator {
	int num;
	int gen;
	
	public Generator()
	{
		
	}
	
	public void Gen(int num)
	{
		if(num > 5000)
		{
			
		}
		else
		{
			int i;
			int tmp;
			
			this.gen = num;
			tmp = num;
			
			// 생성
			for(i = 1 ; i < 4 ; i++)
			{
				this.gen += tmp % 10;
				tmp = (tmp - (tmp % 10)) / 10;
			}
		}
	}
	
	public int isCompare(int i, int comp)
	{		
		// 생성과 동시에 비교 후 selfnumber 판독
		for(i = 1 ; i < comp ; i++)
		{
			this.Gen(i);
			
			if(this.gen == comp)
			{
				return 0;
			}
		}
		return comp;
	}
	
}
