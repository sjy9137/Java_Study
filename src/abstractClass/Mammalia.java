package abstractClass;

public class Mammalia extends Animal{

	Mammalia(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("�������Ҹ�");
	};
	@Override
	protected void run() {
		System.out.println("�������� �ȴ´�.");
	};
	@Override
	protected void fly() {
		
	};
	@Override
	protected void swim() {
		
	}; 
	
}
