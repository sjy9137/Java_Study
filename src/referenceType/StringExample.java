package referenceType;

public class StringExample {

	public static void main(String[] args) {
		String str = "������";
		String str2 = new String("������");  // ��ü�� ���鶧 ���� ���ο� �ּҸ� ����Ƿ� ��� ���ǿʹ� �ٸ��� �񱳸� �Ͽ��� �� �ٸ��ٰ� ����
		String str3 = "������";
		String str4 = new String("������");
		if(str == str2) {
			System.out.println("str �� str2�� ����.");
		}else {
			System.out.println("str �� str2�� �ٸ���.");
		}
		
		if(str == str3) {
			System.out.println("str �� str3�� ����.");
		}else {
			System.out.println("str �� str3�� �ٸ���.");
		}
		
		
		if(str2 == str3) {
			System.out.println("str2 �� str3�� ����.");
		}else {
			System.out.println("str2 �� str�� �ٸ���.");
		}
		
		if(str2.equals(str4)) {  // equals�� ��ü�� ������ üũ�ϴ� ���̰� ==�� �ּҸ� ������� üũ(�� ��������� ���)
			System.out.println("str2 �� str4�� ����.");
		}else {
			System.out.println("str2 �� str4�� �ٸ���.");
		}

	}

}
