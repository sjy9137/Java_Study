package memberClassuse;

public class A {
	int filed;
	void method() {
		
	}
	
	static int fieldS;
	static void methodS() {
		
	}
	
	class B{
		void method() {
			filed = 10;
			method();
			
			fieldS = 10;
			methodS();
		}
	}
	
	static class C{
		void method() {
			//filed = 10;  static �� �ƴϱ� ������
			//method();  static �� �ƴϱ� ������
			fieldS = 10;
			methodS();
		}
	}
	
}
