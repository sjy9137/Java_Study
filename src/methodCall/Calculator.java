package methodCall;

public class Calculator {
	int x, y, z;
	
	Calculator(int x){
		System.out.println("Calculator(int x)");
		this.x = x;
	}
	Calculator(int x, int y){
		this(x);  // 이곳에 쓰이는 this는 생성자  = Calculator(int x) 무조건 첫번째 줄에 작성
		System.out.println("Calculator(int x, int y)");
		this.y = y;
	}
	Calculator(int x, int y, int z){
		this(x, y); // 생성자 호출
		System.out.println("Calculator(int x, int y, int z)");
		this.z = z;
		
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);   // 매서드 콜
		double avg = sum / 2.0;
		return avg;
	}
}
