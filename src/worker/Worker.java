package worker;

public class Worker {
	int Hp = 80;
	int Mp = 10;
	int Gas = 0; // 가스가 10이면 마이닝이 안되게
	String name;
	String type;

	Worker(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	void mining() {
		if (this.Gas == 10) {
			System.out.println("채굴을 할 수 없습니다.");
		} else {
			System.out.println("채굴을 시작합니다.");
			this.Gas += 10;
		}
	}

	void attack(Worker enemy) {
		enemy.Hp -= 10;
		System.out.println("공격을 합니다.");
	}

	void move() {
		System.out.println("이동 합니다.");

	}

	void stop() {

		System.out.println("정지 합니다.");
	}

}
