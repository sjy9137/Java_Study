package methodCall;

public class Calculator {
	int x, y, z;
	
	Calculator(int x){
		System.out.println("Calculator(int x)");
		this.x = x;
	}
	Calculator(int x, int y){
		this(x);  // �̰��� ���̴� this�� ������  = Calculator(int x) ������ ù��° �ٿ� �ۼ�
		System.out.println("Calculator(int x, int y)");
		this.y = y;
	}
	Calculator(int x, int y, int z){
		this(x, y); // ������ ȣ��
		System.out.println("Calculator(int x, int y, int z)");
		this.z = z;
		
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);   // �ż��� ��
		double avg = sum / 2.0;
		return avg;
	}
}
