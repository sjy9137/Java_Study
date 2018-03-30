package referenceType;

public class gugudan {

	public static void main(String[] args) {
		int [][] aArr = new int [8][3];
		
		for(int i = 0 ; i<8 ; i++) {
			for(int j= 0 ; j <3; j++) {
				aArr[i][0] = 9;
				aArr[i][1] = i+2; 
				aArr[i][2] = aArr[i][0]*aArr[i][1];
				System.out.print(aArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}	

}
