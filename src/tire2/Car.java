package tire2;

public class Car {
	//필드 바퀴 4개
	Tire fL = new KumhoTire();
	Tire fR = new KumhoTire();
	Tire rL = new HankookTire(); 
	Tire rR = new HankookTire();
	
	
	void run() {
		fL.roll();
		fR.roll();
		rL.roll();
		rR.roll();
	}
	
	void stop() {

		fL.stop();
		fR.stop();
		rL.stop();
		rR.stop();
	}
	
}
