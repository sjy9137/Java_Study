package abstractClass;

public abstract class Phone {
	String owner;
	Phone (String onwer){
		this.owner = owner;
		System.out.println("Phone()");
	}
	
	void turnOn () {
		System.out.println("turnOn()");
	}
	
	void turnOff() {
		System.out.println("turnOff()");
	}
	abstract void call(); // 추상 매서드
	
}
