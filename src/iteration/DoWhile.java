package iteration;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int me;
		int com;

		com = (int) (Math.random() * 3);

		int input;
		String inputStr;
		Scanner scanner = new Scanner(System.in);

		/*
		 * input = scanner.nextInt(); System.out.println(input);
		 */
		inputStr = scanner.nextLine();
		// System.out.println(inputStr);

		switch (inputStr) {
		case "����":
			System.out.println(inputStr + "�Դϴ�. ");
			me = 0;
			if (com == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("���� �����ϴ�.");
			} else if (com == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (com == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
			}
			break;
		case "����":
			me = 1;
			if (com == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
			} else if (com == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("���� �����ϴ�.");
			} else if (com == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			break;
		case "��":
			me = 2;
			if (com == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (com == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
			} else if (com == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("���� �����ϴ�.");
			}
			break;
		default:
			System.out.println("��Ȯ�ϰ� �Է��� �ּ���");

		}
	}
}
