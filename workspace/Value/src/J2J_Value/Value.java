package J2J_Value;

public class Value 
{
	public static void main(String[] arg)
	{
		int 	iValue 	= 1;
		float 	fValue	= 1.f; // float���� ���ڳ��� f�� �ٿ��־�� float������ �ν��Ѵ�.
		long 	lValue 	= 1000000000000000000L; // long���� int�� �������� Ŭ�� L�� �ٿ��־�� long������ �����ϰ� ���ذ� ����. �ҹ��� l�� �����ϳ� 1�� �򰥸��� L�� ����
		double 	dValue  = 3.14159265358979323846;
		double 	dValue2 = 123.4;
		double 	dValue3	= 1.234e2; // e2�� 10�� ������ ��Ÿ��
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
