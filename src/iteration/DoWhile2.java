package iteration;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
	/*	do{
			동작
		}while(조건문)*/
		
		int password = 123456;
		int input = 0;

		do {
			System.out.println(" 비밀 번호를 입력하시오. ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
		}while(password != input);
	
	}
}
