package promotion2;

public class PromotionExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		System.out.println(a.cal(10, 5));
		a = b;
		System.out.println(a.cal(10, 5));
		a = c;
		System.out.println(a.cal(10, 5));
		
				
	}
}
