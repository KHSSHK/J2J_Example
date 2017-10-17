package J2J_TestString;

public class TestString 
{
	public static void main(String[] arg)
	{
		String a = "Hello Java";
		
		/*
		 * equals은 동일한 문자열을 비교할 때 쓰임, 동일하면 true, 아니면 false을 리턴
		 * indexOf는 문자열의 인덱스(배열번호)를 알려준다
		 * replaceAll은 변경할 문자열을 입력하면 그 문자열의 인덱스를 기억하고 그 위치에 변경할 문자열을 기록한다.
		 * substring은 지정된 인덱스의 범위에 있는 문자열들을 불러온다.
		 * toUppeCase은 소문자를 대문자로 변경한다.
		 */
		System.out.println(a.equals("Hello Java")); 
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java", "World"));
		System.out.println(a.substring(0, 4));
		System.out.println(a.toUpperCase());
		
	}
}
