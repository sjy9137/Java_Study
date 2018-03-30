package referenceType;

public class MultiArrayExample2 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int count =0 ;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					count++;
					array[i][j] = count;
				}
			} else {
				for (int j = array[i].length-1 ; j >= 0; j--) {
					count++;
					array[i][j] = count;
				}
			}
		}
		
		
		int [][] arr1 = {{1,1},{3,4}};
		int [][] arr2 = {{1,1},{3,4}};
		muxArr(arr1, arr2);
		
		
	}
	
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
	
	
	public static void muxArr(int[][] arr1, int [][] arr2) {
		
		int [][] arrResult = new int[2][2];

		for(int i = 0 ; i < arrResult.length ; i++) {
			for(int j = 0; j < arrResult.length ; j++) {
				int sum = 0;
				for(int k = 0; k < arrResult.length ; k++) {
					sum += (arr1[i][k] * arr2[k][j]);
				
				}
				arrResult[i][j] = sum;
			}
			
		}
		
		
		printArr(arrResult);
	}
	
}
