package worker;

public class WorkExample {
	public static void main(String[] args) {
		Worker worker = new Worker("Jiyong", "worker");
		Worker enemy = new Worker("abc", "worker");
		
		worker.mining();
		System.out.println("work's Gas : " +worker.Gas);
		worker.mining();
		System.out.println("work's Gas : " +worker.Gas);
		
		
		worker.attack(enemy);
		worker.move();
		worker.stop();
		System.out.println("Hp : " +enemy.Hp);
		
		
		SCV scv = new SCV("mike", "scv");
		scv.refair(enemy);
		scv.refair(enemy);
		System.out.println("Hp : " +enemy.Hp);
		
		Drone drone = new Drone("ant", "drone");
		drone.attack(enemy);
		drone.attack(enemy);
		System.out.println("Hp : " +enemy.Hp);
		
		
	}
}
