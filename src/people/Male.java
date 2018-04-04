package people;

public class Male extends Human {


	@Override
	void run() {
		if (Mode == HUMAN) {
			super.run();
		} else if (Mode == MALE) {
			System.out.println("MALE run");
		}

	}
}
