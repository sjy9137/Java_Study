package abstractClass;

public class Mammalia extends Animal{

	Mammalia(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("포유류소리");
	};
	@Override
	protected void run() {
		System.out.println("지상으로 걷는다.");
	};
	@Override
	protected void fly() {
		
	};
	@Override
	protected void swim() {
		
	}; 
	
}
