package referenceType;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] num = new int[5];
		int max;
		int min;
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
		
		for (int i = 1; i < num.length; i++) {
			if(max == num[i]) {
				temp = num[0];
				num [0] = max;
				num[i] = temp;
			}
		}
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("num["+i+"] : "+ num[i]);
		}
		
	}
}
