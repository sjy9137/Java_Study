package condition;

public class SwithchExample {

	public static void main(String[] args) {
		int month = (int) (Math.random() * 12) + 1;

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("�ش� " + month + "���� �ܿ� �Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("�ش� " + month + "���� �� �Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ش� " + month + "���� ���� �Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�ش� " + month + "���� ���� �Դϴ�.");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
