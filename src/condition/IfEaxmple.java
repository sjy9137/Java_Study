package condition;

public class IfEaxmple {
	public static void main(String[] args) {
		int a = 13;
		
		if(a % 2 == 0) {
			System.out.println("소수가 아닙니다.");
		}else if(a % 5 == 0) {
			System.out.println("소수가 아닙니다.");
		}else if(a % 7 == 0) {
			System.out.println("소수가 아닙니다.");
		}else if(a % 11 == 0) {
			System.out.println("소수가 아닙니다.");
		}else {
			System.out.println("소수입니다.");
		}
		
	}
}

