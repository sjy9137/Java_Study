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
		case "가위":
			System.out.println(inputStr + "입니다. ");
			me = 0;
			if (com == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("서로 비겼습니다.");
			} else if (com == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
			}
			break;
		case "바위":
			me = 1;
			if (com == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
			} else if (com == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("서로 비겼습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			}
			break;
		case "보":
			me = 2;
			if (com == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (com == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("서로 비겼습니다.");
			}
			break;
		default:
			System.out.println("정확하게 입력해 주세요");

		}
	}
}
