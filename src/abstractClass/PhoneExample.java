package abstractClass;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone p = new Phone("GHI");  ºÒ°¡´É
		SmartPhone sp = new SmartPhone("David");

		sp.turnOn();
		sp.turnOff();
		sp.call();
	}

}
