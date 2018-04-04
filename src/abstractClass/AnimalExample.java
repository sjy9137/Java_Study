package abstractClass;

public class AnimalExample {

	public static void main(String[] args) {
		Fish f = new Fish("±ÝºØ¾î", "¾î·ù");
		
		f.swim();
		f.sound();
		
		Bird b = new Bird("´ß", "Á¶·ù");
		System.out.println(b.name);
		System.out.println(b.type);
		b.fly();
		b.swim();
		b.sound();
	}

}
