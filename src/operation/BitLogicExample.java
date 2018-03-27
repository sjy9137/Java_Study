package operation;

public class BitLogicExample {
	public static void main(String[] args) {
		int a = 4;
		
		System.out.println(a << 2);
		a <<= 2;
		System.out.println(a >> 1);
		
		a = -4;
		System.out.println(a << 2);
		a <<= 2;
		System.out.println(a >> 1);
	}
}
