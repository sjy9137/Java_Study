package iteration;

public class Combination {
	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		for (int i = 1; i <= 9; i++) {
			num1 = i;
			for (int j = i; j <= 9; j++) {
				num2 = j;
				for (int k = j; k <= 9; k++) {
					num3 = k;
					if (num1 != num2 && num2 != num3 && num1 != num3)
						System.out.print("[" + i + " " + j + " " + k + "]   ");
				}
			}
			System.out.println();
		}

	}
}
