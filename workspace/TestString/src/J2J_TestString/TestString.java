package J2J_TestString;

public class TestString 
{
	public static void main(String[] arg)
	{
		String a = "Hello Java";
		
		/*
		 * equals�� ������ ���ڿ��� ���� �� ����, �����ϸ� true, �ƴϸ� false�� ����
		 * indexOf�� ���ڿ��� �ε���(�迭��ȣ)�� �˷��ش�
		 * replaceAll�� ������ ���ڿ��� �Է��ϸ� �� ���ڿ��� �ε����� ����ϰ� �� ��ġ�� ������ ���ڿ��� ����Ѵ�.
		 * substring�� ������ �ε����� ������ �ִ� ���ڿ����� �ҷ��´�.
		 * toUppeCase�� �ҹ��ڸ� �빮�ڷ� �����Ѵ�.
		 */
		System.out.println(a.equals("Hello Java")); 
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java", "World"));
		System.out.println(a.substring(0, 4));
		System.out.println(a.toUpperCase());
		
	}
}
