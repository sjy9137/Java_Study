package iteration;

public class ForExampleStar {

	public static void main(String[] args) {
		char star = '¡Ù';
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i >= j && i < 4) {
					System.out.print(star);
				} else if (i <= j && i > 3) {
					System.out.print(star);
				}
			}
			System.out.println("");
		}
	}
}
