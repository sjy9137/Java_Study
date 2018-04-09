package localClass;

public class Outter {
	//자바 7버전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
	//자바 8버전
	public void method2(int arg) {
		int localVariable = 1;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
