package referenceType;

public class MultiArray {

	public static void main(String[] args) {
		int [][] aArr = new int [2][3];
		int [][] aArr2 = {{1,2}, {3,4}};

		aArr[0][0] = 1;
		aArr[0][1] = 2;
		aArr[1][0] = 3;
		aArr[1][1] = 4;
		for(int i = 0 ; i<2 ; i++) {
			for(int j= 0 ; j <3; j++) {
				System.out.print(aArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}	

}
