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
			//filed = 10;  static 이 아니기 때문에
			//method();  static 이 아니기 때문에
			fieldS = 10;
			methodS();
		}
	}
	
}
