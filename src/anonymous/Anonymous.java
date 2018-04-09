package anonymous;

public class Anonymous {
	//익명 객체 사용
	Person filed = new Person() {
		@Override
		void wake() {
			System.out.println("wake up at 8");
		}
		
		void work() {
			System.out.println("출근합니다.");
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			@Override
			void wake() {
				System.out.println("wake up at 9");
				walk();
			}
			
			void walk() {
				System.out.println("산책");
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}
