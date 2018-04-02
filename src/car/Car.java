package car;

public class Car {
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자 - 초기화가 목적
	/*Car(){ // 기본생성자
		System.out.println("생성자 Car");
		color = "블루";
		speed = 0;
	}*/
	//생성자2 - 초기화가 목적
	Car(int maxSpeed){ 
		System.out.println("생성자 Car(int)");
		this.maxSpeed = maxSpeed;
	}
	Car(int maxSpeed, int speed){ 
		System.out.println("생성자 Car(int)");
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
}
