package iteration;

public class Example3Star {
	public static void main(String[] args) {
		char star = '*';

		for (int i = 0; i < 4; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
