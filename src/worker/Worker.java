package worker;

public class Worker {
	int Hp = 80;
	int Mp = 10;
	int Gas = 0; // ������ 10�̸� ���̴��� �ȵǰ�
	String name;
	String type;

	Worker(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	void mining() {
		if (this.Gas == 10) {
			System.out.println("ä���� �� �� �����ϴ�.");
		} else {
			System.out.println("ä���� �����մϴ�.");
			this.Gas += 10;
		}
	}

	void attack(Worker enemy) {
		enemy.Hp -= 10;
		System.out.println("������ �մϴ�.");
	}

	void move() {
		System.out.println("�̵� �մϴ�.");

	}

	void stop() {

		System.out.println("���� �մϴ�.");
	}

}
