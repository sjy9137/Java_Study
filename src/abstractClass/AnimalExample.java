package abstractClass;

public class AnimalExample {

	public static void main(String[] args) {
		Fish f = new Fish("�ݺؾ�", "���");
		
		f.swim();
		f.sound();
		
		Bird b = new Bird("��", "����");
		System.out.println(b.name);
		System.out.println(b.type);
		b.fly();
		b.swim();
		b.sound();
	}

}
