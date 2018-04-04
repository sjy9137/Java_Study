package abstractClass;

public class Fish extends Animal{

	Fish(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("뻐금뻐금 소리낸다.");
	};
	@Override
	protected void run() {
		
	};
	@Override
	protected void fly() {
		
	};
	@Override
	protected void swim() {
		System.out.println("물속에 헤엄 친다.");
	}; 
}
