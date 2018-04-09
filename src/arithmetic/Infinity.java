package arithmetic;

public class Infinity {
	public static void main(String[] args) {
	int x = 5;
	double y = 0.0;
	double z = x/y;
	
//	System.out.println(z);
	
	if(Double.isInfinite(z)) {
			System.out.println("무한대 입니다.");
			z = Double.MAX_VALUE;
	}
	System.out.println(z);
	String userInput = "NaN";
	
	double val = Double.valueOf(userInput);
	
	System.out.println(val);
	
	}
}
