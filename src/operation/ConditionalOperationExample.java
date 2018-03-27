package operation;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 58;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 'D';
		
		System.out.println(grade);
		
		
		int a = 50;
		int b = 60;
		int c = 40;
		
		
		int result = (a > b) ? ((a > c)? a :c) : (b > c)? b : c;
		
		System.out.println(result);
	}
}
