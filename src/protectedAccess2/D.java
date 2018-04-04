package protectedAccess2;

import protectedAccess.A;

public class D extends A{
	public void method2() {
		
		D d = new D();
		
		d.method();
		super.method();
	}
}
