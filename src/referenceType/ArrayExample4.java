package referenceType;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] num = new int[5];
		int max;
		int min;
		int maxindex = 0;
		int temp;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		max = num[0];
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			if(max < temp) {
				max = temp;
				maxindex = i;
			}
		}
		
		
		System.out.println("max : "+ max);
		
		
		
		min = num[0];
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			if(min > temp) {
				min = temp;
			}
		}
		System.out.println("min : "+ min);
		
		swapArray(num, 0, maxindex);
		printArray(num);
	
	}
	
	
	public static void swapArray(int[] array, int x, int y) {
		int temp = 0;
		temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("num["+i+"] : "+ array[i]);
		}
	}
	
}
