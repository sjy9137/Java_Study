package referenceType;

public class ArrayExample {
	public static void main(String[] args) {
	//	int[]scores = {83, 90, 87};
		int[]scores = new int [] {83, 90, 87};
		/*System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);*/
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println(sum);
		System.out.println("average : "+sum/3.0);
	}
}
