package referenceType;

public class Fibonacci {
	public static void main(String[] args) {

		int[] pivo = new int[10];
		int[] pivo2 = new int[10];
		int[] pivo3 = new int[10];
		
		pivo[0] = 1;
		pivo[1] = 1;

		for (int i = 2; i < pivo.length; i++) {
			pivo[i] = pivo[i - 1] + pivo[i - 2];
		}
/*		for (int i = 0; i < pivo.length; i++) {
			System.out.print(pivo[i] + " ");
		}*/

		System.out.println();

		for (int i = 0; i < pivo2.length; i++) {
			pivo2[i] = pivo[i];
		}

		/*for (int i = 0; i < pivo2.length; i++) {
			System.out.print(pivo2[i] + " ");
		}*/
		int j = 0;
		for(int value : pivo) {
			System.out.print(value+ " ");
			pivo3[j++] = value;
		}
		System.out.println();
		
		for(int i = 0; i < pivo3.length; i++) {
			System.out.print(pivo3[i] + " ");
		}
		
		
	}
}
