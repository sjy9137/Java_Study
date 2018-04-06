package exception;

public class ClassCastException {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		chageDog(dog);
		
		
		//Class Cast Expection
		Cat cat = new Cat();
		chageDog(cat);
	}	
	
	public static void chageDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			
		}else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			
		}
	}
	
}


class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}
