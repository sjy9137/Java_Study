package abstractClass;

public class Fish extends Animal{

	Fish(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("���ݻ��� �Ҹ�����.");
	};
	@Override
	protected void run() {
		
	};
	@Override
	protected void fly() {
		
	};
	@Override
	protected void swim() {
		System.out.println("���ӿ� ��� ģ��.");
	}; 
}
