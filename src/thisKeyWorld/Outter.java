package thisKeyWorld;

public class Outter {
	String filed = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	//�ν��Ͻ�
	class Nested {
		String filed = "Nested-filed";

		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.filed);
			this.method();
			System.out.println(Outter.this.filed);
			Outter.this.method();
		}
	}
}
