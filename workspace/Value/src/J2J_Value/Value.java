package J2J_Value;

public class Value 
{
	public static void main(String[] arg)
	{
		int 	iValue 	= 1;
		float 	fValue	= 1.f; // float형은 숫자끝에 f를 붙여주어야 float형임을 인식한다.
		long 	lValue 	= 1000000000000000000L; // long형은 int의 범위보다 클때 L을 붙여주어야 long형임을 인지하고 오해가 없다. 소문자 l도 가능하나 1과 헷갈리니 L을 쓰자
		double 	dValue  = 3.14159265358979323846;
		double 	dValue2 = 123.4;
		double 	dValue3	= 1.234e2; // e2는 10의 제곱을 나타냄
		byte	bHex	= 0xC;
		short	sOct	= 023;
		
		System.out.println(iValue);
		System.out.println(fValue);
		System.out.println(lValue);
		System.out.println(dValue);
		System.out.println(dValue2);
		System.out.println(dValue3);
		System.out.printf("%x, %d, %o, %d", bHex, bHex, sOct, sOct);
	}
}
