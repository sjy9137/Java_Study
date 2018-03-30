package referenceType;

public class Bubble {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 6, 7, 2, 5};
		
		for(int i =0; i <arr.length ; i++) {
			for(int j =0 ; j < arr.length-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = 0;
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		for(int value : arr) {
			System.out.print(value + " ");
			
		}
		
		

	}

}
