package iteration;

public class gugudan {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i != j) {
					System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				}else {
					System.out.print("\t");
				}		
			}
			System.out.println("");
		}

	}

}
