package referenceType;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] pivo = { 90, 70, 80, 60 };
		int[] pivo2 = new int[5];

		System.arraycopy(pivo, 1, pivo2, 1, 3);
		for (int value : pivo2) {
			System.out.print(value + " ");
		}
		System.out.println();

		ArrayCopy(pivo, 1, pivo2, 1, 3);

		/*
		 * for (int value : pivo2) { System.out.print(value + " "); }
		 */

		/*
		 * printArray(pivo); System.out.println(); printArray(pivo2);
		 * printReverseArray(pivo);
		 */

	}

	public static void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

	public static void printReverseArray(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	public static void ArrayCopy(int[] array1, int start1, int[] array2, int start2, int size) {
		boolean possible = true;

		for (int i = start1; i < start1 + size; i++) {
			if (start1 + size < array2.length) {
				array2[start2] = array1[i];
				start2++;
				possible = true;
			} else {
				possible = false;
			}
		}
		
		/*while(size > 0){
			array2[start2++] = array1[start1++];
			size--;
		}*/  //다른 방식의 코드
		
		
		if (possible == true) {
			printArray(array2);
		} else {
			System.out.println("배열 크기를 초과하였습니다. 다시 설정해주세요");
		}

	}

}
