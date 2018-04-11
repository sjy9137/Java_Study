package genericmethod;

public class UtilExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.<String>boxing("honghong");
		String strValue = box2.get();
		System.out.println(strValue);
		
	}
}
