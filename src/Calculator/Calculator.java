package Calculator;

public class Calculator {
	boolean power = false;

	//오버로드 Overload  => 매서드가 동일한 명이 가능한 형태
	double area(double x){
		return x * x;
	}
	
	double area(int x){
		return x * x;
	}
	
	
	double area(double x, double  y){
		return x * y;
	}
	
	int add(int x, int y) {
		if (power == true) {
			return x + y;
		} else {
			return 0;
		}
	}

	int minus(int x, int y) {
		if (power == true) {
			return x - y;
		} else {
			return 0;
		}
	}

	int mux(int x, int y) {
		if (power == true) {
			return x * y;
		} else {
			return 0;
		}
	}

	double divid(int x, int y) {
		if (power == true) {
			return ((double) x / (double) y);
		} else {
			return 0;
		}
	}
}
