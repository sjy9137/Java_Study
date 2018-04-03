package worker;

public class Drone extends Worker{
	
	Drone(String name, String type){
		super(name, type);
	}
	
	@Override
	void attack(Worker enemy) {
		enemy.Hp -= 10;
		System.out.println("공격을 합니다.");
	}
}
