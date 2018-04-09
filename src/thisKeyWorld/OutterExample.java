package thisKeyWorld;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Nested nested = out.new Nested();
		
		
		System.out.println(out.filed);
		out.method();
		
		System.out.println(nested.filed);
		nested.method();
		
		System.out.println("-----------------");
		nested.print();
	}

}
