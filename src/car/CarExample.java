package car;

public class CarExample {
	public static void main(String[] args) {
		// Car mycar = new Car(); // 생성자를 정의하면 기본 생성자 사용이 불가
		/*
		 * Car mycar2 = new Car(300); Car mycar3 = new Car(200, 500);
		 * 
		 * System.out.println(mycar2.company); System.out.println(mycar2.model);
		 * System.out.println(mycar2.color); System.out.println(mycar2.maxSpeed);
		 * System.out.println(mycar2.speed);
		 * 
		 * mycar2.speed = 100; System.out.println(mycar2.speed);
		 */

		SuperCar mycar = new SuperCar();
		mycar.enginOn();
		for (int i = 0; i < 20; i++) {
			mycar.run();
		}

	}

}
