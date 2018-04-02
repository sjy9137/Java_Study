package car;

import org.omg.CORBA.SystemException;

public class SuperCar {

	int speed = 0;
	int gas = 100;
	int maxSpeed = 200;
	boolean engineOnOff = false;

	int getSpeed() {
		return this.speed;
	}

	void enginOn() {
		System.out.println("Engin On!");
		engineOnOff = true;
	}

	void runAcc() { // gas -50
		if (gas == 0) {
			System.out.println("Gas is exhausted");
		} else if (gas > 0) {
			System.out.println(this.gas);
		}
	}

	void run() {
		if (engineOnOff && (gas >= 10)) {
			if (this.speed < this.maxSpeed - 10) { // 190����
				this.speed += 10;
				this.gas -= 10;
				System.out.println(" �ü�  : " + speed + "km/h�� �޸��ϴ�.");
			} else if (this.speed > this.maxSpeed - 10) {
				this.speed = 200;
				this.gas -= 10;
				System.out.println(" �ü�  : " + speed + "km/h�� �޸��ϴ�.");
			}
		} else if (engineOnOff == false) {
			System.out.println("������ ���ּ���");
		} else {
			System.out.println("�⸧�� �־��ּ���");
			this.speed = 0;
			System.out.println(" �ü�  : " + speed + "km/h�� �޸��ϴ�.");
		}
	}

}
