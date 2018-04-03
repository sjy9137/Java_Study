package inheritance;


public class SuperCar extends Car{

/*	int speed = 0;
	int gas = 100;
	int maxSpeed= 400;
	boolean engineOnOff = false;*/
	
	
	SuperCar(){ 
		super(400);
		System.out.println("SuperCar()");
	}
	
	
	SuperCar(String company, String model, String color){ 
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	void booster() {
		this.speed += 100;
	}
	
	
	/*int getSpeed() {
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
			if (this.speed < this.maxSpeed - 10) { // 190이하
				this.speed += 10;
				this.gas -= 10;
				System.out.println(" 시속  : " + speed + "km/h로 달립니다.");
			} else if (this.speed > this.maxSpeed - 10) {
				this.speed = 200;
				this.gas -= 10;
				System.out.println(" 시속  : " + speed + "km/h로 달립니다.");
			}
		} else if (engineOnOff == false) {
			System.out.println("전원을 켜주세요");
		} else {
			System.out.println("기름을 넣어주세요");
			this.speed = 0;
			System.out.println(" 시속  : " + speed + "km/h로 달립니다.");
		}
	}*/

}
