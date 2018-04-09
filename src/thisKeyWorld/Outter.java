package thisKeyWorld;

public class Outter {
	String filed = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	//인스턴스
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
