package nestedClass;

public class Main {

	public static void main(String[] args) {
		//�ν��Ͻ� Ŭ����
		A a =new A();
		A.B b = a.new B();
		b.fieldB = 3;
		b.methodB();
		
		//���� Ŭ����
		A.C c = new A.C();
		c.fieldC = 3;
		c.methodC();
		A.C.filedS = 3;
		A.C.methodCS();
		
		
		//���� �޼ҵ�
		a.method();
		
	}

}
