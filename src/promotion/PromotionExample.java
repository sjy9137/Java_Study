package promotion;

public class PromotionExample {
	public static void main(String[] args) {
		// ���� ������ ū ������ ������ �ڵ� ����ȯ�� �ȴ�.
		byte bValue = 10;
		int iValue = bValue;
		
		System.out.println(iValue);
		
		char cValue = '��';  // �����ڵ� AC00
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(iValue);
		
		
		// ū ������ ���� ������ ������ ���� ����ȯ�� �ؾ��Ѵ�.
		iValue =(int)lValue;
		bValue =(byte)lValue;
	
		System.out.println(iValue);
		System.out.println(bValue);

		
	}
}
