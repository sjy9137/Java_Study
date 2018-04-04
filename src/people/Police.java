package people;

public class Police extends Male {

	
	@Override
	void run() {
		if(Mode == POLICE) {
			System.out.println("Police run");
		}else {
			super.run();
		}
	}
}
