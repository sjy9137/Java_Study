package iteration;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
	/*	do{
			����
		}while(���ǹ�)*/
		
		int password = 123456;
		int input = 0;

		do {
			System.out.println(" ��� ��ȣ�� �Է��Ͻÿ�. ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
		}while(password != input);
	
	}
}
