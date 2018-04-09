package anonymous;

public class AnonoymousExample {
	public static void main(String[] args) {
		Anonymous anon = new Anonymous();

		anon.filed.wake();
		// anon.filed.work();

		anon.method1();

		/*Person per = new Person() {
			@Override
			void wake() {
				System.out.println("wake up at 10");
			}
		};*/
		
		anon.method2(new Person() {
			void study() {
				System.out.println("studying");
			}
			
			@Override
			void wake() {
				System.out.println("wake up at 10");
				study();
			}
		});

	}
}
