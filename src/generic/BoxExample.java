package generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String, Integer> box = new Box<String, Integer>();
		box.set("honggildong");
		String name = (String)box.get();
		
		
	/*	Box<Apple, > apple = new Box<Apple>(); //변환할 타입을 결정
		apple.set(new Apple());
		Apple apple2 = apple.get();*/
	}
}
