package superCall;

public class SupersonicAirplane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;

	int flyMode = NORMAL;

	@Override
	void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("Supersonic");
		} else {
			super.fly();
		}

	}

}
