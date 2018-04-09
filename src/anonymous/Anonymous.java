package anonymous;

public class Anonymous {
	//�͸� ��ü ���
	Person filed = new Person() {
		@Override
		void wake() {
			System.out.println("wake up at 8");
		}
		
		void work() {
			System.out.println("����մϴ�.");
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
				System.out.println("��å");
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}
