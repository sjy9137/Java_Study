package abstractClass;

public abstract class Animal {
	String name;
	String type;
	
	protected Animal(String name) {
		this.name = name;
	}
	
	protected Animal(String name, String type) {
		this(name);
		this.type = type;
	}
	
	protected abstract void sound();
	protected abstract void run();
	protected abstract void fly();
	protected abstract void swim();
 }
