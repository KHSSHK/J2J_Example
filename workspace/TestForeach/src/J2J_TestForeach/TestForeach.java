package J2J_TestForeach;

import java.util.ArrayList;

public class TestForeach 
{
	public static void main(String[] args) 
	{
		// �ڷ���<���׸���> ����  = new ����ڷ���<���׸���>();
		// ���׸����� ����ϴ� ������ ������ ����ȯ���� ���� ������ �����ϰ���
		// �ʱ���� Ư�� �ڷ����� �����Ͽ� �ڿ� ���� ����ȯ ������ �ּ�ȭ�ϰ�
		// ��Ȯ�ϰ� �ڷ������� Ư�� �ڷ������� �̷���� �迭��� �̷���� �ִٰ�
		// ���� �����ν� ������ ������ ���δ�.
		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		/*
		 * for each ���� for(type var : interate)
		 * Ư�� �ڷ����� ���������� for���� ����Ͽ� �о���϶� ����Ѵ�.
		 * JAVA�� foreach���� 1���� ���������� �����Ͽ�
		 * �� �κи� �����Ͽ� ����ؾ� �Ѵ�.
		 */
		for(String number : numbers)
		{
			System.out.println(number);
		}
		
	}
}
