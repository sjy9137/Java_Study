package Calculator;

public class CalculatorStatic {
	static final double pi = 3.14159;
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static String information;
	static String name = "SungJiYong";
	static String gender = "male";
	
	
	// static -> main -> instance(new) 순서대로 코딩이 진행
	
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
	
	static {
		info = company + " - "  + model;
		information = name + " - " + gender;
	}
}
