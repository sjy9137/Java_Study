package access;

public class B {
	int b= 2;
	
	void run() {
		A a = new A();
		a.setA(11); 
		
		System.out.println(" a: "+ a.getA());
	}
}
