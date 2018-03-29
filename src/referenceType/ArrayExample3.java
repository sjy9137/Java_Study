package referenceType;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] num = new int[5];
		int max = 0;
		int min;
		int temp;
		int index = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}


		for (int i = 0; i < num.length-1; i++) {
			max = num[i];
			for (int j = i+1 ; j <num.length; j++) {
				temp = num[j];
				if (max < temp) {
					max = temp;
					index = j;
				}else if(num[i] == max) {
					index = i;
				}
			}
			
			temp = num[i];
			num[i] = max;
			num[index] = temp;
			
			for (int k = 0; k < num.length; k++) {
				System.out.println("num[" + k + "] : " + num[k]);
			}
			System.out.println();

		}

	}
}
