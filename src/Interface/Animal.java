package Interface;

public abstract class Animal { //추상 클래스
	String kind;
	
	void breathe() {
		System.out.println("Breathe()");
	}
	
	abstract void sound();

}
