package referenceType;

public class MultiArrayExample4 {
	public static void main(String[] args) {
		int[][] array = {{1, 0, 0}, {1, 0, 0}, {1, 1, 1}};
		int[][] array2 = new int[3][3];
		
		
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				array2[(array.length-1) - i][(array[i].length-1)-j] = array[i][j];
			}
		}

		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < array2.length ; i++) {
			for(int j = 0 ; j < array2[i].length ; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
