package iteration;

public class WhileExample {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println("3의 배수는 : "+i);
			}
			i++;
		}

	}
}
