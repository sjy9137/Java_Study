package classOverride;

public class Computer extends Calculator {
	//@Override
	double areaCircle(double r) {
		System.out.println("Override ����");
		return Math.PI*r*r;
	}

}
