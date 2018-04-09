package nestedClass;

public class A {
	int filedA;
	static int filedAS;

	A() {
		System.out.println("A()");
	}

	void methodA() {
		System.out.println("methodA()");
	}

	static void filedAS() {

	}

	// instance member class
	class B {
		int fieldB;
		// static int filedS;

		B() {
			System.out.println("B()");
		}

		/*
		 * static voidfiledS() {
		 * 
		 * }
		 */
		void methodB() {
			System.out.println("methodB()");
		}
	}

	// static member class
	static class C {
		int fieldC;
		static int filedS;

		C() {
			System.out.println("C()");
		}

		void methodC() {
			System.out.println("methodB()");
		}

		static void methodCS() {
			System.out.println("methodS()");
		}
	}

	void method() {

		// local class
		class D {

			D() {
				System.out.println("D()");
			}

			int filedD;

			// static int filedS;
			void methodD() {

			}
			/*
			 * static void filedDS() {
			 * 
			 * }
			 */
		}
		D d = new D();
		d.filedD = 3;
		d.methodD();

	}

}
