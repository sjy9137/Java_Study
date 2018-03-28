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
			System.out.println("이 숫자는 소수 입니다.");
		} else {
			System.out.println("이 숫자는 소수가 아닙니다. 약수의 개수는 : " + count + " 입니다.");
		}
	}
}
