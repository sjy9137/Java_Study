package nestedClass;

public class Main {

	public static void main(String[] args) {
		//인스턴스 클래스
		A a =new A();
		A.B b = a.new B();
		b.fieldB = 3;
		b.methodB();
		
		//정적 클래스
		A.C c = new A.C();
		c.fieldC = 3;
		c.methodC();
		A.C.filedS = 3;
		A.C.methodCS();
		
		
		//로컬 메소드
		a.method();
		
	}

}
