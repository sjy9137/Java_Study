package iteration;

public class ForEaxmple2 {
	public static void main(String[] args) {
		int number = 137;
		int count = 2;
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("�� ���ڴ� �Ҽ� �Դϴ�.");
		} else {
			System.out.println("�� ���ڴ� �Ҽ��� �ƴմϴ�. ����� ������ : " + count + " �Դϴ�.");
		}
	}
}
