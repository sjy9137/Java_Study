package worker;

public class SCV extends Worker {

	SCV(String name, String type) {
		super(name, type);  //�θ� ����Ʈ ����
	}

	boolean refair(Worker worker) {
		if (worker.Hp < 80) {
			worker.Hp += 10;
			System.out.println("������ �Ϸ��Ͽ����ϴ�. : " + worker.Hp);
			return true;
		} else {
			System.out.println("������ �� �� �����ϴ�.");
			return false;
		}
	}

}
