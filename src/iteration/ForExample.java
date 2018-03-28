package iteration;

public class ForExample {
	public static void main(String[] args) {
		long count = 1L;
		long sum = 0;
		for(int i =0 ; i < 14; i++) {
			if(i == 0) {
				count = 1;
			}else {
			count = count*3;
			}
			System.out.println((i+1)+"¹øÂ° number : "+count);
			sum += count;
		}
		System.out.println("sum : "+sum);
	}
}
