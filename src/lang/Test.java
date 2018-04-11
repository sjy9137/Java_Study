package lang;

public class Test {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		a.equals(b);
		a = b;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
