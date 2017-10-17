package Gugu;

public class Dan 
{
	int[] rst;  // 한단의 값들을 저장
	int[][] ad; // 1~9단의 값을 저장
	
	/*
	 * 한 단씩 결과 출력
	 */
	public void Dan(int step)
	{
		int[] rst = new int[9];
		int i;
		
		System.out.printf("%d단 입니다.\r\n", step);
		
		for(i = 0 ; i < 9 ; i++)
		{
			rst[i] = step * (i+1);
			System.out.printf("%d X %d = %d\r\n", step, i+1, rst[i]);
		}
		
		System.out.printf("--------------\r\n\r\n");
	}
	
	public void Dan()
	{
		int[][] ad = new int[9][9];
		int i, j;
		
		for(j = 0 ; j < 9 ; j++)
		{
			System.out.printf("%d단 입니다.\r\n", j+1);
			
			for(i = 0 ; i < 9 ; i++)
			{
				ad[j][i] = (j+1) * (i+1);
				System.out.printf("%d X %d = %d\r\n", j+1, i+1, ad[j][i]);
			}
			
			System.out.printf("--------------\r\n\r\n");
		}
	}
}
