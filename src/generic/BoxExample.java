package generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String, Integer> box = new Box<String, Integer>();
		box.set("honggildong");
		String name = (String)box.get();
		
		
	/*	Box<Apple, > apple = new Box<Apple>(); //��ȯ�� Ÿ���� ����
		apple.set(new Apple());
		Apple apple2 = apple.get();*/
	}
}
