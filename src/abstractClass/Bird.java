package abstractClass;

public class Bird extends Animal{
	
	Bird(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("±± �Ҹ����� ");
	};
	@Override
	protected void run() {
		
	};
	@Override
	protected void fly() {
		System.out.println("�ϴ��� ���ƴٴѴ�.");
	};
	@Override
	protected void swim() {

	}; 
}
