package Interface;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal animal = null;
		animal = new Dog();
		animal = new Cat();
		
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	static void animalSound(Animal animal) {
		animal.sound();
	}

}
