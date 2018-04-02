package Calculator;

public class CalculaotrExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.power = true;
		
		System.out.println(cal.add(10, 9));
		System.out.println(cal.minus(10, 9));
		System.out.println(cal.mux(10, 9));
		System.out.println(cal.divid(10, 9));
	}
}
