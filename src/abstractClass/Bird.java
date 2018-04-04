package abstractClass;

public class Bird extends Animal{
	
	Bird(String name, String type){
		super(name, type);
	}
	
	@Override
	protected void sound() {
		System.out.println("Â±Â± ¼Ò¸®³½´Ù ");
	};
	@Override
	protected void run() {
		
	};
	@Override
	protected void fly() {
		System.out.println("ÇÏ´ÃÀ» ³¯¾Æ´Ù´Ñ´Ù.");
	};
	@Override
	protected void swim() {

	}; 
}
