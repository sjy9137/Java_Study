package iteration;

public class WhileExample2 {
	public static void main(String[] args) {
		int number = 1683;
		int i = 1;
		int count = 0;
		while(i > 1 && i < 1683) {
			if(number % i == 0) {
				count++;
				
			}
			i++;
		}
		if(count == 0 ) {
			System.out.println("소수 입니다.");
		}
	}
}
