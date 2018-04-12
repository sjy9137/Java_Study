package shareMeomory;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalc(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalc(calculator);
		user2.start();
	}
}
