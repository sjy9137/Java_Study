package access;

public class C {
	int c= 3;
	
	void run() {
		access2.D d =new access2.D();
		d.d = 41;
		
		System.out.println(d.d);
	}
}
