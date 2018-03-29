package iteration;

public class DoWhile3 {
	public static void main(String[] args) {
	/*	do{
			동작
		}while(조건문)*/
		
		int randomnum;
	
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		do {
			randomnum = (int) (Math.random() * 44);
			num1 = randomnum;
			randomnum = (int) (Math.random() * 44);
			num2 = randomnum;
			randomnum = (int) (Math.random() * 44);
			num3 = randomnum;
		}while(num1 == num2 && num2 == num3 && num1 == num3);
		System.out.println("num1 : "+ num1 + "  num2 : " +num2 + "  num3 : " + num3);
	}
}
