package J2J_TestForeach;

import java.util.ArrayList;

public class TestForeach 
{
	public static void main(String[] args) 
	{
		// 자료형<제네릭스> 변수  = new 상속자료형<제네릭스>();
		// 제네릭스를 사용하는 이유는 변수의 형변환으로 인한 에러를 방지하고자
		// 초기부터 특정 자료형만 지정하여 뒤에 나올 형변환 문제를 최소화하고
		// 명확하게 자료형에는 특정 자료형으로 이루어진 배열들로 이루어져 있다고
		// 선언 함으로써 오해의 소지를 줄인다.
		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		/*
		 * for each 문은 for(type var : interate)
		 * 특정 자료형을 순사적으로 for문을 사용하여 읽어들일때 사용한다.
		 * JAVA의 foreach문은 1씩만 순차적으로 증가하여
		 * 이 부분만 주의하여 사용해야 한다.
		 */
		for(String number : numbers)
		{
			System.out.println(number);
		}
		
	}
}
