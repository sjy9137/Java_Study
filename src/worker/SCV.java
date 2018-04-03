package worker;

public class SCV extends Worker {

	SCV(String name, String type) {
		super(name, type);  //부모 디폴트 생성
	}

	boolean refair(Worker worker) {
		if (worker.Hp < 80) {
			worker.Hp += 10;
			System.out.println("수리를 완료하였습니다. : " + worker.Hp);
			return true;
		} else {
			System.out.println("수리를 할 수 없습니다.");
			return false;
		}
	}

}
