package tire2;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		System.out.println();
		
		
		mycar.fL = new HankookTire();
		mycar.fR = new HankookTire();
		mycar.run();
		System.out.println();
		
		Tire mi = new Tire() {
			public void roll() {
				System.out.println("�̼���Ÿ�̾�");
			}
		};
		
		
		mycar.rL = mi;
		mycar.rR = mi;
		mycar.run();
		
		
		mycar.stop();
		mycar.fL.stop();
	
	}
	
	
	
	
}
