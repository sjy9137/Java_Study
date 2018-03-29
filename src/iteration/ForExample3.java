package iteration;

public class ForExample3 {
	public static void main(String[] args) {
		int a = 9;
		int b = 35;
		int mul_a = 1;
		int mul_b = 1;
		int max = 1;
		int temp = 0;
		
		
		
		for (int i = 1; i <= a; i++) {
			if (9 % i == 0 && a % i == 0) {
				temp = i;
				if (temp > max) {
					max = i;
				}
			}
		}
		System.out.println("최대 공약수는 : " + max);
		mul_a = a * 1;
		mul_b = b * 1;

		for (int i = 1; i <= a+1; i++) {
			for (int j = 1; j <= b+1; j++) {
				// System.out.println("j "+j);
				if (mul_a < mul_b) {
					mul_a = a * j;
					if (mul_a == mul_b) {
						System.out.println("최소 공배수는 : " + mul_a);
						break;
					}
				}
			}
			if (mul_a > mul_b) {
				mul_b = b * i;
				if (mul_a == mul_b) {
					System.out.println("최소 공배수는 : " + mul_a);
					break;
				}
			}
		}
		

	}
}
